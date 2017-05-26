package com.davidrus.shiokosho.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by david on 25-May-17.
 */
@Getter
@Setter
public class Recipe {

    private long id;

    private String recipeContent;

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", recipeContent='" + recipeContent + '\'' +
                '}';
    }
}

