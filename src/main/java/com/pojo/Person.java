package com.pojo;

public class Person {
    private String personName;
    private int personAge;
    private Address address;

    public Person() {
        super();
    }

    public Person(String personName, int personAge, Address address) {
        this.personName = personName;
        this.personAge = personAge;
        this.address = address;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personName='" + personName + '\'' +
                ", personAge=" + personAge +
                ", address=" + address +
                '}';
    }
}
