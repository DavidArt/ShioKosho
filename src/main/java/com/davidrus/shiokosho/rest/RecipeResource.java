package com.davidrus.shiokosho.rest;

import com.davidrus.shiokosho.dto.Recipe;
import com.davidrus.shiokosho.services.RecipeService;
import com.sun.org.apache.regexp.internal.RE;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by david on 29-May-17.
 */
@Controller
@Slf4j
@Path(RestConstants.RECIPE_PATH)
public class RecipeResource {

    @Resource
    RecipeService recipeService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createRecipe(Recipe recipe) {
        if (recipeService.createRecipe(recipe)) {
            return Response.status(Response.Status.CREATED).build();
        }
        return Response.accepted().build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getRecipeById(@PathParam("id") Long id) {
        Recipe recipe = recipeService.getRecipeById(id);
        if (recipe != null) {
            return Response.ok().entity(recipe).build();
        }
        return Response.accepted().build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateRecipe(Recipe recipe) {
        if (recipeService.updateRecipe(recipe)) {
            return Response.noContent().build();
        }
        return Response.accepted().build();
    }

    @DELETE
    public Response deleteRecipe(@PathParam("id") Long id) {
        if (recipeService.deleteRecipe(id)) {
            return Response.noContent().build();
        }
        return Response.accepted().build();
    }
}
