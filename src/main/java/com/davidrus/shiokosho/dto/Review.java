package com.davidrus.shiokosho.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by david on 25-May-17.
 */
@Getter
@Setter
public class Review {

    private long id;

    private String reviewContent;

    private Restaurant restaurant;

    private User user;

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", reviewContent='" + reviewContent + '\'' +
                ", restaurant=" + restaurant +
                ", user=" + user +
                '}';
    }
}
