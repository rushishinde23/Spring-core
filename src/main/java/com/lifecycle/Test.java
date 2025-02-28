package com.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        //BEAN-LIFECYCLE USING XML
        //ApplicationContext context=new ClassPathXmlApplicationContext("lifecycleConfig.xml");
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("lifecycleConfig.xml");

//        Samosa samosa1=(Samosa) context.getBean("samosa1");
//        System.out.println(samosa1);
        context.registerShutdownHook();

        //BEAN LIFECYCLE USING INTERFACE

        Coke coke1=(Coke) context.getBean("coke1");
        System.out.println(coke1);

        //BEAN LIFECYCLE USING ANNOTATION


    }
}
