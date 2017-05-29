package com.davidrus.shiokosho.rest;

import com.davidrus.shiokosho.dto.Restaurant;
import com.davidrus.shiokosho.services.RestaurantService;
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
@Path(RestConstants.RESTAURANT_PATH)
public class RestaurantResource {

    @Resource
    RestaurantService restaurantService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createRestaurant(Restaurant restaurant) {
        if (restaurantService.createRestaurant(restaurant)) {
            return Response.status(Response.Status.CREATED).build();
        }
        return Response.accepted().build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getRestaurantById(@PathParam("id") Long id) {
        Restaurant restaurant = restaurantService.getRestaurantById(id);
        if (restaurant != null) {
            return Response.status(Response.Status.CREATED).build();
        }
        return Response.accepted().build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getRestaurantByName(@PathParam("name") String name) {
        Restaurant restaurant = restaurantService.getRestaurantByName(name);
        if (restaurant != null) {
            return Response.status(Response.Status.CREATED).build();
        }
        return Response.accepted().build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateRestaurant(Restaurant restaurant) {
        if (restaurantService.updateRestaurant(restaurant)) {
            return Response.noContent().build();
        }
        return Response.accepted().build();
    }

    @DELETE
    public Response deleteRestaurant(@PathParam("id") Long id) {
        if (restaurantService.deleteRestaurant(id)) {
            return Response.noContent().build();
        }
        return Response.accepted().build();
    }
}
