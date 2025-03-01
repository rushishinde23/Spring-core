package com.javaconfig;

import com.pojo.Student;
import org.springframework.stereotype.Component;

@Component
public class Item {
    private String itemName;
    private String itemPrice;
    private Student student;

    public Item(Student student) {
        this.student = student;
    }

    public Item(String itemName, String itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public void printItems(){
        System.out.println("I have Mobile phone having price 20k!");
    }


    public Item() {
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", itemPrice='" + itemPrice + '\'' +
                '}';
    }
}
