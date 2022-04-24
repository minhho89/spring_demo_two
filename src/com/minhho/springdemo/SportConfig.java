package com.minhho.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.minhho.springdemo")
@PropertySource("classpath:sport.properties")
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
