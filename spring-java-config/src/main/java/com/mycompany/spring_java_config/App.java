package com.mycompany.spring_java_config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(SportConfig.class);
		Coach theCoach=context.getBean("tennisCoach",Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
    }
}
