package main.java.controllers;

import main.java.models.Offers;
import main.java.models.OffersResponse;

public interface OffersService {
    public Offers getOffer(int id);
    public OffersResponse addOffer(Offers adv);
    public OffersResponse cancelledOffer(int id);
    public Offers[] getAllOffers();
    public Offers getExpiredDare(int id);

}