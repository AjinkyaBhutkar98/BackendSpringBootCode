package org.spring.practise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Task t=new Task("Code Review");
        Employee e1=new Employee(1,"Ajinkya Bhutkar",t);

        t.assignTask();

        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");

        Employee e2=context.getBean("emp1", Employee.class);

        e2.assignTask();

    }
}
