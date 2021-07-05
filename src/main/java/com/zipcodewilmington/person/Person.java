package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String birthMonth;
    private String phoneOS;
    private Boolean employed;
    private String preferCokeOrPepsi;

    public Person() {
    name = "";
    age = Integer.MAX_VALUE;
    }

    public Person(int age) {
        setAge(age);
    }

    public Person(String name) {
        setName(name);
    }

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirthMonth(String birthMonth){
        this.birthMonth = birthMonth;
    }

    public void setPhoneOS(String phoneOS){
        this.phoneOS = phoneOS;
    }

    public void setEmployed(Boolean employed){
        this.employed = employed;
    }

    public void setPreferCokeOrPepsi (String preferCokeOrPepsi){
        this.preferCokeOrPepsi = preferCokeOrPepsi;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getBirthMonth() {
        return birthMonth;
    }

    public String getPhoneOS(){
        return phoneOS;
    }

    public Boolean getEmployed(){
        return employed;
    }

    public String getPreferCokeOrPepsi(){
        return preferCokeOrPepsi;
    }
}
