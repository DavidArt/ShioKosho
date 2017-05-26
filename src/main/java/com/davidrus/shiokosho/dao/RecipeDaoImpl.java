package com.davidrus.shiokosho.dao;

import com.davidrus.shiokosho.domain.Recipe;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

/**
 * Created by david on 26-May-17.
 */
@Repository
@Slf4j
public class RecipeDaoImpl implements RecipeDao {

    @PersistenceContext
    public EntityManager em;

    @Override
    @Transactional
    public boolean createRecipe(Recipe recipe) {
        em.persist(recipe);

        return true;
    }

    @Override
    public Recipe getRecipeById(Long id) {
        TypedQuery<Recipe> query = em.createNamedQuery(Recipe.GET_RECIPE_BY_ID, Recipe.class);
        query.setParameter("id", id);

        return query.getSingleResult();
    }

    @Override
    @Transactional
    public boolean updateRecipe(Recipe recipe) {
        em.merge(recipe);

        return true;
    }

    @Override
    @Transactional
    public boolean deleteRecipe(Long id) {
        TypedQuery<Recipe> query = em.createNamedQuery(Recipe.GET_RECIPE_BY_ID, Recipe.class);
        query.setParameter("id", id);
        Recipe recipe = query.getSingleResult();
        em.remove(recipe);

        return true;
    }
}
