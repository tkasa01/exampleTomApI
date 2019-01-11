package main.java.controllers;
import main.java.models.Person;

public interface PersonService {
    public PersonResponse addPerson(Person user);
    public PersonResponse deletePerson(long id);
    public Person getPerson(long id);
    public Person[] getAllPeople();
}
