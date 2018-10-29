package main.java.controllers;
import main.java.models.Offers;
import main.java.models.OffersResponse;
import main.java.service.OffersServ;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Path("/offers")
@Consumes(MediaType.APPLICATION_JSON)
public class OfferImplementation  implements OffersService {

    private static Map<Integer, Offers> adv = new HashMap<Integer, Offers>();
    OffersServ textOffers = new OffersServ();


    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Offers> getOffers(){
        return textOffers.getOffers();
    }



    @POST
    @Produces(MediaType.APPLICATION_XML)
    public String addMessage(){
        return "POST works! fom offers!!!" ;
    }


    @Override
    public Offers getOffer(int id) {
        return null;
    }

    @Override
    @Path("/addOffer")
    @POST
    public OffersResponse addOffer(Offers offer) {
        OffersResponse response = new OffersResponse();
        if(adv.get(offer.getId()) != null){
            response.setStatus(false);
            response.setMessage("The person already exists");
            return  response;
        }
        adv.put(offer.getId(), offer);
        response.setStatus(true);
        response.setMessage("The person is created.");
        return response;
    }

    @Override
    public OffersResponse cancelledOffer(int id) {
        return null;
    }


    @Override
    public Offers[] getAllOffers() {
       return new Offers[0];
  }

    @Override
    public Offers getExpiredDare(int id) {
        return null;
    }

/*
    @GET
    @Path("/{id}/getOffer")
    @Produces(MediaType.APPLICATION_JSON)
    public Offers getOffer(@PathParam("id") int id){
        Offers adv = new Offers(2, 1, "adv","advrt, blabla", 26.90);
        adv.setExpiredDate(20/4/2018, 20/7/2018);
        return  adv;

    }*/

   /* @GET
    @Path("/{id}/getOffer")
    @Produces(MediaType.APPLICATION_JSON)
    public String getOffer() {
        try{
            JsonObjectBuilder b = Json.createObjectBuilder();
            b.add("id",2);
            b.add("nameOfTheOffer", "adv");
            b.add("description", "avdert, blabla");
            b.add("price", 238.50);
            b.add("startDate", 20/4/2018);
            b.add("endDate", 20/7/2018);

            return  b.build().toString();
        }catch (Exception e){
            return "{\"error\":\""+ e.toString()+"\"}";
        }
    }*/

}
