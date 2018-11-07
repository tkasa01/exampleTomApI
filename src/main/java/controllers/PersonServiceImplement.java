package main.java.controllers;

import main.java.database.Database;
import main.java.models.Person;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

//import main.java.models.PersonResponse;

public class PersonServiceImplement {

    private static Map<String, Person> sellersMap = Database.getPeople();

    public PersonServiceImplement (){
        sellersMap.put("Lola", new Person(1, "Lola","Smith","07346743435","lola@mail.com"));
        sellersMap.put("Bob", new Person(2,"Bob", "Sherman", "034578934", "bob@mail.com"));
    }

    public List<Person> getAllPeople() {
        return new ArrayList<Person>(sellersMap.values());
    }

    public Person getPerson(String firstName){
        return sellersMap.get(firstName);
    }

    public Person addPerson(Person p) {
        PersonResponse response = new PersonResponse();
            p.setId(sellersMap.size() + 1);
            sellersMap.put(p.getFirstName(), p);
            return p;
    }

    public Person updatePerson(Person firstName){
        if(firstName.getFirstName().isEmpty()){
            return null;
        }
        sellersMap.put(firstName.getFirstName(), firstName);
        return firstName;
    }

    public Person deletePerson(String firstName) {
        return sellersMap.remove(firstName);
    }

}

