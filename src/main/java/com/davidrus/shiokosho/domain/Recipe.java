package com.davidrus.shiokosho.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.ws.rs.PUT;

/**
 * Created by david on 25-May-17.
 */
@Getter
@Setter
@Entity
@NamedQueries({
        @NamedQuery(name = Recipe.GET_RECIPE_BY_ID, query = "SELECT r FROM Recipe r WHERE r.id = :id")
})
public class Recipe {

    public static final String GET_RECIPE_BY_ID = "getRecipeById";

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "recipeContent")
    private String recipeContent;

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", recipeContent='" + recipeContent + '\'' +
                '}';
    }
}

