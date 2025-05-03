package org.spring.practise;

import org.spring.practise.config.Student;
import org.spring.practise.config.studentConfig;
import org.spring.practise.core.BeanContainer;
import org.spring.practise.core.Employee;
import org.spring.practise.core.Task;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

      Task t=new Task("Code Review");
      Employee e1=new Employee(1,"Ajinkya Bhutkar",t);

        e1.assignTask();

//        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        ApplicationContext context=new AnnotationConfigApplicationContext(BeanContainer.class);
        //obj creation using spring container

        Employee emp1=context.getBean("emp1",Employee.class);

        emp1.assignTask();

//        ApplicationContext studentContext=new AnnotationConfigApplicationContext(studentConfig.class);
//        Student std1=studentContext.getBean("student1", Student.class);
        Student std1=context.getBean("student", Student.class);

        std1.joinClass();

    }
}
