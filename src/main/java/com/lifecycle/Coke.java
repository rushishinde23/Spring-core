package com.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Coke implements InitializingBean, DisposableBean {
    private double price;

    public Coke(double price) {
        this.price = price;
    }

    public Coke() {
        super();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Coke{" +
                "price=" + price +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Inside init of lifecycle for intefacebased configuration ");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Inside destory of lifecycle for intefacebased configuration ");
    }
}
