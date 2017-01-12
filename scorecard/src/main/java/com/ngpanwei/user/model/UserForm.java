package com.ngpanwei.user.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * Created by pwng on 11/01/2017.
 */
public class UserForm {
    @NotNull @Size(min=2, max=30)
    private String name ;

    @NotNull @Size(min=2, max=30)
    private String email ;

    public UserForm() {
    }
    @Override
    public String toString() {
        return "UserForm{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
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


}
