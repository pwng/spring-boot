package com.ngpanwei.user.model;

import javax.persistence.*;

/**
 * Created by pwng on 11/01/2017.
 */
@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;

    private String name ;
    private String email ;

    public User() {

    }
    public User (String name, String email) {
        this.name = name ;
        this.email = email ;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format(
                "User[id=%d, name='%s', email='%s']",
                id, name, email);
    }



}
