package main.java.models;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class OffersTest {



    @Test
     void test() throws Exception {
        try {
            String s = "Junit test is working!";
            Assert.assertEquals("Junit test is working!", s);
        }catch (Exception e){

        }
    }

    @Test
    public void checkGetNameOfTheOffer(){
        String name = "Advert";
        Offers adv = new Offers();
        adv.setNameOfTheOffer("Advert");
        String s = adv.getNameOfTheOffer();
        Assert.assertEquals("Advert", s);
        Assert.assertNotNull(s);
    }

    @Test
    public void checkGetDescription() {
        String description = "This is the best offer!";
        Offers adv = new Offers();
        adv.setDescription(description);
        String s = adv.getDescription();
        Assert.assertEquals( "This is the best offer!",s);
        Assert.assertNotNull(s);
    }
    @Test
    public void getId() {
        int id = 1;
        Offers adv = new Offers();
        adv.setId(id);
        int id1 = adv.getId();
        Assert.assertEquals(1, id1);
    }


    @Test
    void getNameOfTheOffer() {
        String name = "table";
        Offers adv = new Offers();
        adv.setDescription(name);
        String s = adv.getDescription();
        Assert.assertEquals( "This is the best offer!",s);
        Assert.assertNotNull(s);
    }

    @Test
    void getDescription() {
    }

    @Test
    void getPrice() {
        double price = 20.00;
        Offers adv = new Offers();
        adv.setPrice(price);
        double price1 = adv.getPrice();
        Assert.assertEquals(3.14,20.00, price1);
    }

    @Test
    void getStartDate() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yy");
        Date startDate = new Date();
        System.out.println(startDate);
        Date date1 = sdf.parse("07-11-2018");
        Date date2 = sdf.parse("06-11-2018");
        Date date3 = sdf.parse("09-11-2018");

        if(startDate.compareTo(date1) == 0){
            System.out.println("The date is today");
        }else if(startDate.compareTo(date2) > 0){
            System.out.println("The date is after");
        }else if(startDate.compareTo(date3) < 0){
            System.out.println("The date is after");
        }else{
            System.out.println("How to get date?");
        }
        Assert.assertNotNull(startDate);
    }

    @Test
    void getEndDate() {

    }

    @Test
    void isStatus() {
    }

    @Test
    void isCancelled() {
    }

    @Test
    void setId() {
    }

    @Test
    void setPerson() {
    }

    @Test
    void setNameOfTheOffer() {
    }

    @Test
    void setDescription() {
    }

    @Test
    void setPrice() {
    }

    @Test
    void setStartDate() {
    }

    @Test
    void setStatus() {
    }

    @Test
    void setExpiredDate() {
    }

    @Test
    void setCancelled() {
    }

    @Test
    void printOffer() {
    }

    @Test
    void getString(){

    }
}