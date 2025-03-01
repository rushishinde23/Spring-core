package com.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("stereoConfig.xml");
        Student student=context.getBean("student1", Student.class);
        System.out.println(student.hashCode());

        Student student2=context.getBean("student1", Student.class);
        System.out.println(student2.hashCode());
    }
}
