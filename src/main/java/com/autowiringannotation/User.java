package com.autowiringannotation;

import org.springframework.beans.factory.annotation.Autowired;

public class User {
    private String name;

    @Autowired
    private Phone phone;

    public User(String name, Phone phone) {
        this.name = name;
        this.phone = phone;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                '}';
    }
}
