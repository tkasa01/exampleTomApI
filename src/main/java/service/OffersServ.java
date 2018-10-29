package main.java.service;

import main.java.models.Offers;

import java.util.ArrayList;
import java.util.List;

public class OffersServ {
    private Object list;

    public List<Offers>getOffers(){
        Offers o1 = new Offers(3, 1, "desc", "very good desc vas on the sale.", 300.00);
        Offers o2 = new Offers(4,1,"car", "white, big car on the sale!", 12000.50);
        List<Offers> list = new ArrayList<>();
        list.add(o1);
        list.add(o2);
        return  list;

    }
}
