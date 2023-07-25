package org.niit;

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

        ApplicationContext movie=new AnnotationConfigApplicationContext(AppConfig.class);

        Movie m=movie.getBean("m1",Movie.class);
        System.out.println(m);
    }
}
