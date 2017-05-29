package com.davidrus.shiokosho.rest;

import com.davidrus.shiokosho.dto.Menu;
import com.davidrus.shiokosho.services.MenuService;
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
@Path(RestConstants.MENU_PATH)
public class MenuResource {

    @Resource
    MenuService menuService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createMenu(Menu menu) {
        if (menuService.createMenu(menu)) {
            return Response.status(Response.Status.CREATED).build();
        }
        return Response.accepted().build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMenuById(@PathParam("id") Long id) {
        Menu menu = menuService.getMenuById(id);
        if (menu != null) {
            return Response.ok().entity(menu).build();
        }
        return Response.accepted().build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateMenu(Menu menu) {
        if (menuService.updateMenu(menu)) {
            return Response.noContent().build();
        }
        return Response.accepted().build();
    }

    @DELETE
    public Response deleteMenu(@PathParam("id") Long id) {
        if (menuService.deleteMenu(id)) {
            return Response.noContent().build();
        }
        return Response.accepted().build();
    }
}


















