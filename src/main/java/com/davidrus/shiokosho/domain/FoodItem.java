package com.davidrus.shiokosho.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by david on 25-May-17.
 */
@Getter
@Setter
@Entity
@NamedQueries({
        @NamedQuery(name = FoodItem.GET_FOOD_ITEM_BY_ID, query = "SELECT f FROM FoodItem f WHERE f.id = :id")
})
public class FoodItem {

    public static final String GET_FOOD_ITEM_BY_ID = "getFoodItemById";

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "foodItem")
    private String foodItem;

    @ManyToOne
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
