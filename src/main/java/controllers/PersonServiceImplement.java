package main.java.controllers;

import main.java.models.Person;
//import main.java.models.PersonResponse;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Path("/seller")
@Consumes(MediaType.APPLICATION_JSON)

public class PersonServiceImplement implements PersonService{
    private File file;

    private static Map<Integer, Person> seller = new HashMap<Integer, Person>();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String sayPlainText(){
        return "Hello Postman from Person class!!!";
    }

    @Override
    @Path("/add")
    @POST
    public PersonResponse addPerson(Person p) {
        PersonResponse response = new PersonResponse();
        if(seller.get(p.getId()) != null){
            response.setStatus(false);
            response.setMessage("The person already exists");
            return  response;
        }
        seller.put(p.getId(), p);
        response.setStatus(true);
        response.setMessage("The person is created.");
        return response;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
        public String addMessage(){
        return "POST works!";
    }

   @Override
    @GET
    @Path("/{id}/delete")
    @Produces(MediaType.APPLICATION_JSON)
    public PersonResponse deletePerson(@PathParam("id") int id) {
        PersonResponse response = new PersonResponse();
        if(seller.get(id) == null){
            response.setStatus(false);
            response.setMessage("The person doesn't found");
            return response;
        }
        seller.remove(id);
        response.setStatus(true);
        response.setMessage("The person deleted.");
        return response;
    }


    @GET
    @Path("/home")
    public InputStream getHome() throws FileNotFoundException {
        File f = getFileFrom();
        return  new FileInputStream(f);

    }

    private File getFileFrom() {
        return file;
    }

    @GET
    @Path("/{id}/getOne")
    @Produces(MediaType.APPLICATION_XML)
    public Person getPerson(@PathParam("id") int id){
        Person seller1 = new Person("Lola","Smith", 1,"lola@gmail.com");
        seller1.setPhoneNumber("07348522498");
        return  seller1;

    }

    @Override
    @GET
    @Path("/{id}/getAll")
    public Person[] getAllPeople() {
        Set<Integer> ids = seller.keySet();
        Person[] people = new Person[ids.size()];
        int i = 0;
        for(Integer id : ids){
            people[i]= seller.get(id);
            i++;
        }
        return people;
    }
}

