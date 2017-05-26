package com.davidrus.shiokosho.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by david on 25-May-17.
 */
@Getter
@Setter
public class FoodItem {

    private long id;

    private String foodItem;

    private Menu menu;

    @Override
    public String toString() {
        return "FoodItem{" +
                "id=" + id +
                ", foodItem='" + foodItem + '\'' +
                ", menu=" + menu +
                '}';
    }
}
