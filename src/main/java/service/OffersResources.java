package main.java.service;

import main.java.controllers.OfferImplementation;
import main.java.models.Offers;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("/offers")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class OffersResources {

   private OfferImplementation offerImplementation = new OfferImplementation();

    @GET
    public List<Offers> getAllOffers(@QueryParam("month" )int month,
                                     @QueryParam("start" )int start,
                                     @QueryParam("size" )int size){
        if(month > 0){
            return offerImplementation.getAllOffersLastPeriod(month);
        }
        if( start >= 0 &&  size > 0){
            return offerImplementation.getAllOffersPaginated(start, size);
        }
        return offerImplementation.getAllOffers();
    }


    @GET
    @Path("/{offerId}")
    public  Offers getOffer(@PathParam("offerId") int id){
        return offerImplementation.getOffer(id);
    }

    @POST
    public Offers addOffer(Offers offer){
        return   offerImplementation.addOffer(offer);
    }

    @PUT
    @Path("/{offerId}")
    public Offers updateOffer(@PathParam("offerId") int id, Offers offer) {
        offer.setId(id);
        return offerImplementation.updateOffer(offer);
    }


    @DELETE
    @Path("/{offerId}")
    public void cancelledOffer(@PathParam("offerId") int id) {
         offerImplementation.deleteOffer(id);
    }

    @Path("/{offerId}/comments")
    public CommentsResources useAllComments(){
        return new CommentsResources();
    }
}
