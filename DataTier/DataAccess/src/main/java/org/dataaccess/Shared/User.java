package org.dataaccess.Shared;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "\"user\"", schema = "reverso_sep")
public class User implements Serializable
{
    @Id
    @Column(name = "username")
    private String username;

    private String password;

    private String f_name;

    private String l_name;

    private int credits;

    private String type;

    @OneToOne(mappedBy = "user")
    private Cart cart;

    public User() {
    }

    public User(String username, String password, String f_name, String l_name, int credits, String type) {
        this.username = username;
        this.password = password;
        this.f_name = f_name;
        this.l_name = l_name;
        this.credits = credits;
        this.type = type;
    }

    public User(String username, String password, String f_name, String l_name) {
        this.username = username;
        this.password = password;
        this.f_name = f_name;
        this.l_name = l_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}

