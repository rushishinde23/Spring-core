package com.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
//        Item item=context.getBean("getItem", Item.class);
        Item item=context.getBean("s1", Item.class);
        item.printItems();
    }
}
