package com.minhho.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class JavaConfigDemo {

	public static void main(String[] args) {
		// Read spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// Get the bean from spring container
		SwimCoach theCoach = (SwimCoach) context.getBean("mySwimCoach", Coach.class);
		
		// Call a method on the bean
//		System.out.println(theCoach.getDailyWorkout());
//		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
	
		// Close the context
		context.close();
	}

}
