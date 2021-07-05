package com.zipcodewilmington.person;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testBirthMonth(){
        Person person = new Person();
        String expected = "October";
        person.setBirthMonth(expected);
        String actual = person.getBirthMonth();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPhoneOS(){
        Person person = new Person();
        String expected = "iOS";
        person.setPhoneOS(expected);
        String actual = person.getPhoneOS();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEmployed(){
        Person person = new Person();
        Boolean expected = true;
        person.setEmployed(expected);
        Boolean actual = person.getEmployed();
        Assert.assertTrue(String.valueOf(expected), actual);
    }

    @Test
    public void testEmployed2(){
        Person person = new Person();
        Boolean expected = false;
        person.setEmployed(expected);
        Boolean actual = person.getEmployed();
        Assert.assertFalse(String.valueOf(expected), actual);
    }

    @Test
    public void testPreferCokeOrPepsi(){
        Person person = new Person();
        String expected = "Coke";
        person.setPreferCokeOrPepsi(expected);
        String actual = person.getPreferCokeOrPepsi();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public  void testHoursWorkedToday(){
        Person person = new Person();
        Double expected = 8.5;
        person.setHoursWorkedToday(expected);
        Double actual = person.getHoursWorkedToday();
        Assert.assertEquals(expected, actual, 0);
    }

}
