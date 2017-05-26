package com.davidrus.shiokosho.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * Created by david on 25-May-17.
 */
@Getter
@Setter
@Entity
@NamedQueries({
        @NamedQuery(name = Menu.GET_MENU_BY_ID, query = "SELECT m FROM Menu m WHERE m.id = :id")
})
public class Menu {

    public static final String GET_MENU_BY_ID = "getMenuById";

    @Id
    @GeneratedValue
    private long id;

    @OneToOne
    private Restaurant restaurant;

    @OneToMany(mappedBy = "menu")
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
