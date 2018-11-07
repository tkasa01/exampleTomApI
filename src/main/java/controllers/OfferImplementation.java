package main.java.controllers;

import main.java.database.Database;
import main.java.models.Offers;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

public class OfferImplementation {

    private Map<Integer, Offers> offersMap = Database.getOffers();



    //constructor
    public OfferImplementation(){
        offersMap.put(1, new Offers( 1, "desc", "very good desc vas on the sale.", 300.00));
        offersMap.put(2, new Offers(2,"car", "white, big car on the sale!", 12000.50));
    }

    public List<Offers> getAllOffers() {

        return new ArrayList<Offers>(offersMap.values());
    }

    public List<Offers> getAllOffersLastPeriod(int month) {
        List<Offers> offerForLastPeriod = new ArrayList<>();
        Calendar cal = Calendar.getInstance();
        for(Offers offer : offersMap.values()){
            cal.setTime(offer.getStartDate());
            if ( cal.get(Calendar.MONTH) == month){
                offerForLastPeriod.add(offer);
            }
        }
        return  offerForLastPeriod;
    }

    public List<Offers>getAllOffersPaginated(int start, int size){
        List<Offers> list = new ArrayList<Offers>(offersMap.values());
        if(start + size > list.size())
            return new ArrayList<Offers>();
        return list.subList(start, start + size);

    }

    public Offers getOffer(int id) {
        return offersMap.get(id);

    }

    public Offers addOffer(Offers offer) {
        offer.setId(offersMap.size() + 1); //set the message by adding one to get the one more number for the new message
        offersMap.put(offer.getId(), offer); //put the new message to the Map

        return offer;
    }

    public Offers updateOffer(Offers offer) {
        if (offer.getId() <= 0) {
            return null;
        }
        offersMap.put(offer.getId(), offer);
        return offer;
    }


    public void deleteOffer(int id) {
         offersMap.remove(id);
    }
//=============================
    public Offers cancelOffer(Offers offer) throws InterruptedException {
        if(!offer.checkIfExpired(offer.getEndDate())){
            offersMap.wait();
        }else {
            offersMap.notify();
        }
        return offer;
    }

}




