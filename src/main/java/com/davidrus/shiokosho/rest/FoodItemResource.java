package com.davidrus.shiokosho.rest;

import com.davidrus.shiokosho.dto.FoodItem;
import com.davidrus.shiokosho.services.FoodItemService;
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
@Path(RestConstants.FOOD_ITEM_PATH)
public class FoodItemResource {

    @Resource
    FoodItemService foodItemService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createFoodItem(FoodItem foodItem) {
        if (foodItemService.createFoodItem(foodItem)) {
            return Response.status(Response.Status.CREATED).build();
        }
        return Response.accepted().build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getFoodItemById(@PathParam("id") Long id) {
        FoodItem foodItem = foodItemService.getFoodItemById(id);
        if (foodItem != null) {
            return Response.ok().entity(foodItem).build();
        }
        return Response.accepted().build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateFoodItem(FoodItem foodItem) {
        if (foodItemService.updateFoodItem(foodItem)) {
            return Response.noContent().build();
        }
        return Response.accepted().build();
    }

    @DELETE
    public Response deleteFoodItem(@PathParam("id") Long id) {
        if (foodItemService.deleteFoodItem(id)) {
            return Response.noContent().build();
        }
        return Response.accepted().build();
    }
}









