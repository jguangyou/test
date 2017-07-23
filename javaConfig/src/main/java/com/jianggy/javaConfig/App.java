package com.jianggy.javaConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config1.class);
       Service service = (Service) context.getBean("service");
       service.service();
    }
}
