package com.mycompany.Spring_Dependency_Injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.Spring_Dependency_Injection.Bean.Coach;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = null;
		try {

			context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
			Coach myCoach = context.getBean("theCoach", Coach.class);
			System.out.println("Coach Details: "+myCoach.toString());
			System.out.println("Workout plan of the day: " + myCoach.getDailyWorkout());
			System.out.println("Fortune of the day: " + myCoach.getDailyFortune());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			context.close();
		}
    }
}
