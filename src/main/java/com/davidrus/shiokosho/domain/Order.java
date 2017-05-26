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
        @NamedQuery(name = Order.GET_RECIPE_BY_ID, query = "SELECT o FROM Order o WHERE o.id = :id")
})
public class Order {

    public static final String GET_RECIPE_BY_ID = "getRecipeById0";

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "orderContent")
    private String orderContent;

    @ManyToOne
    private Restaurant restaurant;

    @ManyToOne
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
