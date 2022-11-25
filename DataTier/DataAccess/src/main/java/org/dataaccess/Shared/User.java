package org.dataaccess.Shared;

import javax.persistence.*;

@Entity
@Table(name = "\"user\"")
public class User
{
    @Id
    @SequenceGenerator(
            name="user_id _sequence",
            sequenceName = "user_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_id_sequence"
    )

    private Long id;

    private String username;

    private String password;

    private String f_name;

    private String l_name;

    private int credits;

    private String type;

    public User() {
    }

    public User(Long id, String username, String password, String f_name, String l_name, int credits, String type) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.f_name = f_name;
        this.l_name = l_name;
        this.credits = credits;
        this.type = type;
    }

    public User(String username, String password, String f_name, String l_name, int credits) {
        this.username = username;
        this.password = password;
        this.f_name = f_name;
        this.l_name = l_name;
        this.credits = credits;
        this.type = "customer";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}

