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
        @NamedQuery(name = Review.GET_REVIEW_BY_ID, query = "SELECT r FROM Review r WHERE r.id = :id")
})
public class Review {

    public static final String GET_REVIEW_BY_ID = "getReviewById";

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "reviewContent")
    private String reviewContent;

    @ManyToOne
    private Restaurant restaurant;

    @ManyToOne
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
