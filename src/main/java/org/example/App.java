package org.example;

import org.example.config.MyConfiguration;
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
        ApplicationContext context= new AnnotationConfigApplicationContext(MyConfiguration.class);
        Student student= context.getBean(Student.class);


        student.write_exam();
        System.out.println( "Hello World!" );
    }
}
