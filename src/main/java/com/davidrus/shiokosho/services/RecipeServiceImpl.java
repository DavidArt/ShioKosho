package com.davidrus.shiokosho.services;

import com.davidrus.shiokosho.dao.RecipeDao;
import com.davidrus.shiokosho.dao.ReviewDao;
import com.davidrus.shiokosho.dto.Recipe;
import lombok.extern.slf4j.Slf4j;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by david on 29-May-17.
 */
@Service
@Slf4j
public class RecipeServiceImpl implements RecipeService {

    @Resource
    private Mapper mapper;

    @Resource
    private RecipeDao recipeDao;

    @Override
    public boolean createRecipe(Recipe recipe) {
        com.davidrus.shiokosho.domain.Recipe recipeDomain = mapper.map(recipe, com.davidrus.shiokosho.domain.Recipe.class);
        return recipeDao.createRecipe(recipeDomain);
    }

    @Override
    public Recipe getRecipeById(Long id) {
        com.davidrus.shiokosho.domain.Recipe recipeDomain = recipeDao.getRecipeById(id);
        Recipe recipeDto = mapper.map(recipeDomain, Recipe.class);
        return recipeDto;
    }

    @Override
    public boolean updateRecipe(Recipe recipe) {
        com.davidrus.shiokosho.domain.Recipe recipeDomain = mapper.map(recipe, com.davidrus.shiokosho.domain.Recipe.class);
        return recipeDao.updateRecipe(recipeDomain);
    }

    @Override
    public boolean deleteRecipe(Long id) {
        return recipeDao.deleteRecipe(id);
    }
}
