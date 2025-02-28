package com.springcore;

import com.pojo.Employee;
import com.pojo.Person;
import com.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
          //PRIMITIVE CONFIGURATION
//        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
//        Student student1=(Student) context.getBean("student1");
//        System.out.println(student1);
//        Student student2=(Student) context.getBean("student2");
//        System.out.println(student2);

          //COLLECTION CONFIGURATION
//        ApplicationContext context=new ClassPathXmlApplicationContext("collectionConfig.xml");
//        Employee employee=(Employee) context.getBean("employee1");
//        System.out.println(employee);

          //REFERENCE CONFIGURATION
//        ApplicationContext context=new ClassPathXmlApplicationContext("refConfig.xml");
//        Person person1=(Person) context.getBean("person1");
//        System.out.println(person1);

        //CONSTRUCTOR INJECTION CONFIGURATION
        ApplicationContext context=new ClassPathXmlApplicationContext("ciConfig.xml");
        Person person1=(Person) context.getBean("person1");
        System.out.println(person1);

    }
}
