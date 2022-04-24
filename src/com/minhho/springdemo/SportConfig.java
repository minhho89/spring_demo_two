package com.minhho.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.minhho.springdemo")
public class SportConfig {
	
	@Bean
	FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	@Bean
	Coach mySwimCoach() {
		SwimCoach mySwimCoach = new SwimCoach(sadFortuneService());
		
		return mySwimCoach;
	}
}
