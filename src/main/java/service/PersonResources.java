package main.java.service;

import main.java.controllers.PersonServiceImplement;
import main.java.models.Person;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

//import main.java.models.PersonResponse;

@Path("/sellers")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})

public class PersonResources {
    private PersonServiceImplement sellersImplementation = new PersonServiceImplement();

    @GET
    public List<Person>getAllPeople(){
        return sellersImplementation.getAllPeople();
    }

    @GET
    @Path("/{personName}")
    public Person getPerson(@PathParam("personName") String firstName){
        return sellersImplementation.getPerson(firstName);
    }


    @POST
    @Path("/add")
    public Person addPerson(Person p) {
        return sellersImplementation.addPerson(p);
    }


    @DELETE
    @Path("/{firstName}")
    public void deletePerson(@PathParam("firstName") String firstName) {
        sellersImplementation.deletePerson(firstName);
    }

    @PUT
    @Path("/{firstName}")
    public Person updatePerson(@PathParam("firstName") String firstName, Person person){
        person.setFirstName(firstName);
        return sellersImplementation.updatePerson(person);
    }
}

