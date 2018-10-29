package main.java.controllers;
import main.java.models.Person;

public interface PersonService {
    public PersonResponse addPerson(Person user);
    public PersonResponse deletePerson(int id);
    public Person getPerson(int id);
    public Person[] getAllPeople();
}
