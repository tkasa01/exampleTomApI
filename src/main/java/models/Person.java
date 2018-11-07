package main.java.models;

import java.util.Date;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private Date startDate;

    public Person(){}
    public Person(int newId, String newFirstName, String newLastName,  String newNumber, String newEmail){
        id = newId;
        firstName = newFirstName;
        lastName = newLastName;
        email = newEmail;
        startDate = new Date();
    }

    //Getters
    public int getId(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getEmail(){return email;}
    public Date getStartDate(){return startDate;}

    //Setters
    public void setId(int id){
        this.id = id;
    }
    public void setFirstName(String firstName){
        this.firstName  = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setEmail(String email){this.email = email;}
    public void setStartDate(Date date){this.startDate = date;}

    @Override
    public String toString(){
        return id + ": " + firstName + " " + lastName +" "+ phoneNumber +" "+ email;
    }



}