package com.davidrus.shiokosho.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by david on 25-May-17.
 */
@Getter
@Setter
public class Order {

    private long id;

    private String orderContent;

    private Restaurant restaurant;

    private User user;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderContent='" + orderContent + '\'' +
                ", restaurant=" + restaurant +
                ", user=" + user +
                '}';
    }
}
