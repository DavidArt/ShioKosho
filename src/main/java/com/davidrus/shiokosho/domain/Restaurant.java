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
        @NamedQuery(name = Restaurant.GET_RESTAURANT_BY_ID, query = "SELECT r FROM Restaurant r WHERE r.id =:id")
})
public class Restaurant {

    public static final String GET_RESTAURANT_BY_ID = "getRestaurantById";

    @Id
    @GeneratedValue
    private long id;

    private String name;

    private String address;

    @OneToOne
    private Menu menu;

    @OneToMany(mappedBy = "restaurant")
    private List<Order> order;

    @OneToMany(mappedBy = "restaurant")
    private List<Review> review;

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", menu=" + menu +
                ", order=" + order +
                ", review=" + review +
                '}';
    }
}
