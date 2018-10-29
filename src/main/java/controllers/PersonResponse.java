package main.java.controllers;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PersonResponse {
    private boolean status;
    private String message;

    //Getters
    public boolean isStatus(){
        return status;
    }
    public String getMessage(){
        return  message;
    }
    //Setters
    public void setStatus(boolean status){
        this.status = status;
    }
    public void setMessage(String message){
        this.message = message;
    }

}