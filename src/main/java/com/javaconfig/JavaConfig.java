package com.javaconfig;

import com.pojo.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.javaconfig")
public class JavaConfig {
    @Bean("s1")
    public Item getItem(){
        Item item=new Item(getStudent());;
        return item;
    }
    @Bean
    public Student getStudent(){
        return new Student();
    }
}
