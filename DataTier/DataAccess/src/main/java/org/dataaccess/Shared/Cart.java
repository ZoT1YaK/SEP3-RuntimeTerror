package org.dataaccess.Shared;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cart", schema = "reverso_sep")
public class Cart implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cartId")
    private int id;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "username", referencedColumnName = "username")
    private User username;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "productId", referencedColumnName = "id")
    private Product productId;

    private int quantity;

    private int total;

    public Cart() {
    }

    public Cart(User username, Product productId, int quantity, int total) {
        this.username = username;
        this.productId = productId;
        this.quantity = quantity;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUsername() {
        return username;
    }

    public void setUsername(User username) {
        this.username = username;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
