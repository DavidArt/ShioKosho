package com.davidrus.shiokosho.rest;

import com.davidrus.shiokosho.dto.CockingTip;
import com.davidrus.shiokosho.services.CockingTipService;
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
@Path(RestConstants.COCKING_TIP_PATH)
public class CockingTipResource {

    @Resource
    CockingTipService cockingTipService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createCockingTip(CockingTip cockingTip) {
        if (cockingTipService.createCockingTip(cockingTip)) {
            return Response.status(Response.Status.CREATED).build();
        }
        return Response.accepted().build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCockingTipById(@PathParam("id") Long id) {
        CockingTip cockingTip = cockingTipService.getCockingTipById(id);
        if (cockingTip != null) {
            return Response.ok().entity(cockingTip).build();
        }
        return Response.accepted().build();
    }
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateCockingTip(CockingTip cockingTip) {
        if (cockingTipService.updateCockingTip(cockingTip)) {
            return Response.noContent().build();
        }
        return Response.accepted().build();
    }

    @DELETE
    public Response deleteCockingTip(@PathParam("id") Long id) {
        if (cockingTipService.deleteCockingTip(id)) {
            return Response.noContent().build();
        }
        return Response.accepted().build();
    }

}











