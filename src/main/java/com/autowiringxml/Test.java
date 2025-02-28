package com.autowiringxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("xmlAutowiringConfig.xml");
        User user1=context.getBean("user1", User.class);
        System.out.println(user1);
    }
}
