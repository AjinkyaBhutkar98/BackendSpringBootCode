package org.spring.practise;

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

    }
}
