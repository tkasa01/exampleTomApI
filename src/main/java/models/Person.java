package main.java.models;

//import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlRootElement;

//@Entity
@XmlRootElement(name="seller")
public class Person {
    private String firstName;
    private String lastName;
    private int id;
    private String phoneNumber;
    private String email;

    public Person(){}
    public Person(String newFirstName, String newLastName , int newId, String newEmail){
        firstName = newFirstName;
        lastName = newLastName;
        id = newId;
        email = newEmail;
    }

    //Getters
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getId(){
        return id;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getEmail(){return email;}

    //Setters
    public void setFirstName(String firstName){
        this.firstName  = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setEmail(String email){this.email = email;}

    @Override
    public String toString(){
        return id + ": " + firstName + " " + lastName +" "+ phoneNumber +" "+ email;
    }



}