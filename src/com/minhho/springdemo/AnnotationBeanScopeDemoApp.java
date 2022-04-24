package com.minhho.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("myGymCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myGymCoach", Coach.class);

		System.out.println(theCoach.getDailyFortune());
		
		
		context.close();

	}

}
