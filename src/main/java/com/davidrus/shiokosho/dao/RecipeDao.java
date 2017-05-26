package com.davidrus.shiokosho.dao;

import com.davidrus.shiokosho.domain.Recipe;
import org.springframework.stereotype.Repository;

/**
 * Created by david on 26-May-17.
 */
@Repository
public interface RecipeDao {

    boolean createRecipe(Recipe recipe);

    Recipe getRecipeById(Long id);

    boolean updateRecipe(Recipe recipe);

    boolean deleteRecipe(Long id);

}
