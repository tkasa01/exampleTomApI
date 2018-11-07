package main.java.service;

import main.java.controllers.CommentsService;
import main.java.models.Comments;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/")
@Produces({MediaType.APPLICATION_JSON,MediaType.TEXT_XML})
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})

public class CommentsResources {
    private CommentsService commentsService =  new CommentsService();

    @GET
    public List<Comments> getAllComments(@PathParam("offerId") int offerId){
        return commentsService.getAllComments(offerId);
    }

    @POST
    public Comments addComments(@PathParam("offerId") int offerId, Comments commentId){
        return commentsService.addComment(offerId, commentId);
    }

    @PUT
    @Path("/{commentId}")
    public Comments updateComment(@PathParam("offerId") int offerId, @PathParam("commentId") int id, Comments commentId){
        commentId.setId(id);
        return commentsService.updateComment(offerId, commentId);
    }

    @DELETE
    @Path("/{commentId}")
    public void deleteComment(@PathParam("offerId") int offerId, @PathParam("commentId") int id, Comments commentId){

    }

}
