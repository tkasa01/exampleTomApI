package main.java.models;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@XmlRootElement
public class Offers {
    private int id;
    private int person_id;
    private String nameOfTheOffer;
    private String description;
    private double price;
    private Date startDate;
    private Date endDate;
    private boolean cancelled;
    private Map<Integer, Comments> comments = new HashMap<>();

    public Offers(){}
    public Offers(int newId,  String newNameOfTheOffer, String newDescription, double newPrice){
        id = newId;
       // person_id = person;
        nameOfTheOffer = newNameOfTheOffer;
        description = newDescription;
        price = newPrice;
        cancelled = false;
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
    public boolean isCancelled() {
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
    public void setStartDate(Date startDate){
        this.startDate = startDate;
    }


   /* public void setTimer(int months){
        Timer timer = new Timer();
        TimerTask cancel ;
        timer.schedule(new PeriodicTask(), startDate, 3);
    }*/

    //The method return expired date for  the offer
    public Date setExpiredDate(){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);
        calendar.add(Calendar.MONTH, 3);
        endDate = calendar.getTime();
        return endDate;
    }

    public boolean checkIfExpired(Date expired){
        Date currentDay = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(endDate);
        return !currentDay.before(endDate);
    }

    public void setCancelled() {
        if(!checkIfExpired(endDate)){
            cancelled = true;
        }
    }

    @XmlTransient
    public Map<Integer, Comments> getComments(){
        return comments;
    }

    public void setComments(Map<Integer, Comments> comments){
        this.comments = comments;
    }
    public static void main(String [] args){
        Offers of = new Offers();
        of.setId(1);
        of.setNameOfTheOffer("Desk");
        Date st = new Date();
        of.setStartDate(st);
        of.setExpiredDate();

        System.out.println("Offer: "+ of.getNameOfTheOffer());
        System.out.println("Start day: " + of.getStartDate());
        System.out.println("End date: " + of.getEndDate() );
    }

}