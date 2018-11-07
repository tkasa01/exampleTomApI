package main.java.database;
import main.java.models.Comments;
import main.java.models.Offers;
import main.java.models.Person;

import java.util.HashMap;
import java.util.Map;

 public class Database {
  private static  Map<Integer, Offers> offers = new HashMap<>();
  private static Map<String, Person> sellers = new HashMap<>();
  private static Map<Integer, Comments> comments = new HashMap<>();

  public static Map<Integer, Offers> getOffers(){
   return offers;
  }

  public static Map<String,Person> getPeople(){
   return sellers;
  }


 }

