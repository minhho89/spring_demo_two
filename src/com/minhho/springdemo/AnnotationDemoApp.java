package com.minhho.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// Read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Get the bean from spring container
		Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		Coach gymCoach = context.getBean("myGymCoach", Coach.class);
		
		// Call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(gymCoach.getDailyWorkout());
		System.out.println(gymCoach.getDailyFortune());
		// Close the context
		context.close();
	}

}
