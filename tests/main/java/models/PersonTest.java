package main.java.models;

import junit.framework.TestCase;

public class PersonTest extends TestCase {
    Person person = new Person();

    public void testGetId() throws Exception {
        int id = 1;
        person.setId(id);
        int id1 = person.getId();
        assertEquals(1, id1);

    }

    public void testGetFirstName() {

    }

    public void testGetLastName() {
    }

    public void testGetPhoneNumber() {
    }

    public void testGetEmail() {
    }

    public void testGetStartDate() {
    }

    public void testSetId() {
    }

    public void testSetFirstName() {
    }

    public void testSetLastName() {
    }

    public void testSetPhoneNumber() {
    }

    public void testSetEmail() {
    }

    public void testSetStartDate() {
    }

    public void testToString() {
    }
}