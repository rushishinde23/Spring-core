package com.pojo;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

    private String employeeName;
    private List<Integer> phoneNumbers;
    private Set<String> addresses;
    private Map<String,String> courses;

    public Employee(String employeeName, List<Integer> phoneNumbers, Set<String> addresses, Map<String, String> courses) {
        this.employeeName = employeeName;
        this.phoneNumbers = phoneNumbers;
        this.addresses = addresses;
        this.courses = courses;
    }

    public Employee() {
        super();
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public List<Integer> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<Integer> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public Set<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<String> addresses) {
        this.addresses = addresses;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                ", addresses=" + addresses +
                ", courses=" + courses +
                '}';
    }
}
