package com.lifecycle;

public class Samosa {
    private double price;

    public Samosa() {
        super();
    }

    public Samosa(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }

    public void start(){
        System.out.println("Inside init of xml based lifecycle");
    }

    public void end(){
        System.out.println("Inside destroy of xml based lifecycle");
    }

}
