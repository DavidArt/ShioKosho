package com.davidrus.shiokosho.rest;

import com.davidrus.shiokosho.dto.Review;
import com.davidrus.shiokosho.services.ReviewService;
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
@Path(RestConstants.REVIEW_PATH)
public class ReviewResource {

    @Resource
    ReviewService reviewService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createReview(Review review) {
        if (reviewService.createReview(review)) {
            return Response.status(Response.Status.CREATED).build();
        }
        return Response.accepted().build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getReviewById(@PathParam("id") Long id) {
        Review review = reviewService.getReviewById(id);
        if (review != null) {
            return Response.ok().entity(review).build();
        }
        return Response.accepted().build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateReview(Review review) {
        if (reviewService.updateReview(review)) {
            return Response.noContent().build();
        }
        return Response.accepted().build();
    }

    @DELETE
    public Response deleteReview(@PathParam("id") Long id) {
        if (reviewService.deleteReview(id)) {
            return Response.noContent().build();
        }
        return Response.accepted().build();
    }
}










