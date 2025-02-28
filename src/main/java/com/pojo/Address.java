package com.pojo;

public class Address {
    private String area;
    private String city;
    private String state;

    public Address() {
        super();
    }

    public Address(String area, String city, String state) {
        this.area = area;
        this.city = city;
        this.state = state;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
}
