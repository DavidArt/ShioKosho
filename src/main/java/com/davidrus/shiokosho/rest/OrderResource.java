package com.davidrus.shiokosho.rest;

import com.davidrus.shiokosho.dto.Order;
import com.davidrus.shiokosho.services.OrderService;
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
@Path(RestConstants.ORDER_PATH)
public class OrderResource {

    @Resource
    OrderService orderService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createOrder(Order order) {
        if (orderService.createOrder(order)) {
            return Response.status(Response.Status.CREATED).build();
        }
        return Response.accepted().build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getOrderById(@PathParam("id") Long id) {
        Order order = orderService.getOrderById(id);
        if (order != null) {
            return Response.ok().entity(order).build();
        }
        return Response.accepted().build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateOrder(Order order) {
        if (orderService.updateOrder(order)) {
            return Response.noContent().build();
        }
        return Response.accepted().build();
    }

    @DELETE
    public Response deleteOrder(@PathParam("id") Long id) {
        if (orderService.deleteOrder(id)) {
            return Response.noContent().build();
        }
        return Response.accepted().build();
    }

}












