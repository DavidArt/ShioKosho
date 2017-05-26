package com.davidrus.shiokosho.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by david on 25-May-17.
 */
@Getter
@Setter
public class Menu {

    private long id;

    private Restaurant restaurant;

    private List<FoodItem> foodItems;

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", restaurant=" + restaurant +
                ", foodItems=" + foodItems +
                '}';
    }
}
