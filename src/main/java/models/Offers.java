package main.java.models;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Calendar;
import java.util.Date;

@XmlRootElement(name="offers")
public class Offers {
    private int id;
    private int person_id;
    private String nameOfTheOffer;
    private String description;
    private double price;
    private Date startDate;
    private Date endDate;

    private boolean status;
    private boolean cancelled = false;

    public Offers(){}
    public Offers(int newId, int person, String newNameOfTheOffer, String newDescription, double newPrice){
        id = newId;
        person_id = person;
        nameOfTheOffer = newNameOfTheOffer;
        description = newDescription;
        price = newPrice;
        startDate = new Date();
    }

    //Getters
    public int getId(){ return id; }
    public int getPerson_id(){return person_id;}
    public String getNameOfTheOffer(){
        return nameOfTheOffer;
    }
    public String getDescription(){
        return description;
    }
    public double getPrice(){return price;}
    public Date getStartDate(){
        return startDate;
    }
    public Date getEndDate(){
        return endDate;
    }
    public boolean isStatus(){
        return status;
    }
    public boolean getCancellation(){
        return cancelled;
    }

    //Setters
    public void setId(int id){
        this.id = id;
    }
    public void setPerson(int person_id){
        this.person_id = person_id;
    }
    public void setNameOfTheOffer(String nameOfTheOffer){
        this.nameOfTheOffer = nameOfTheOffer;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setPrice(double price){this.price = price;}
   // public void setStartDate(int startDate){
    //    this.startDate = startDate;
   // }

    public void setStatus(boolean status){
        this.status = status;
    }

    //The method return expired date for  the offer
    public Date setExpiredDate(int startDate, int endDate){
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.set(startDate, endDate);
        calendar.add(Calendar.MONTH, 3);
        java.util.Date expiredDate = calendar.getTime();
        return expiredDate;
    }
    public void setCancelled(){
        if(cancelled){
            cancelled = true;
        }else {
            System.out.println("The offer is already cancelled");
        }
    }

    @Override
    public String toString(){
        return id + ": " + nameOfTheOffer + " " + description + "the price:  £ " + price + "."
                + "The expired date: " + endDate;
    }


}