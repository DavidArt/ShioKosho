package com.davidrus.shiokosho.services;

import com.davidrus.shiokosho.dto.Recipe;
import org.springframework.stereotype.Service;

/**
 * Created by david on 29-May-17.
 */
@Service
public interface RecipeService {

    boolean createRecipe(Recipe recipe);

    Recipe getRecipeById(Long id);

    boolean updateRecipe(Recipe recipe);

    boolean deleteRecipe(Long id);

}
