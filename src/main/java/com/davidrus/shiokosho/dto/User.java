package com.davidrus.shiokosho.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by david on 25-May-17.
 */
@Getter
@Setter
public class User {

    private long id;

    private String name;

    private String email;

    private String password;

    private List<Order> orders;

    private List<Review> reviews;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", orders=" + orders +
                ", reviews=" + reviews +
                '}';
    }
}
