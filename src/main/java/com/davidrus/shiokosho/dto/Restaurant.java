package com.davidrus.shiokosho.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by david on 25-May-17.
 */
@Getter
@Setter
public class Restaurant {

    private long id;

    private String name;

    private String address;

    private Menu menu;

    private List<Order> order;

    private List<Review> review;

    @Override
    public String toString() {
        return "RestaurantDao{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", menu=" + menu +
                ", order=" + order +
                ", review=" + review +
                '}';
    }
}
