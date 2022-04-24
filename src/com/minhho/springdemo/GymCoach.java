package com.minhho.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("myGymCoach")
public class GymCoach implements Coach {
	
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	public GymCoach() {
		System.out.println(">> GymCoach: inside default constructor");
	}
	
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> GymCoach: inside of doMyStartupStuff");
	}
	
	@PreDestroy
	public void doMyCleanupSfuff() {
		System.out.println(">> GymCoach: inside of doMyCleanupSfuff");
	}
	
//	@Autowired
//	public GymCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "Squat squat squat";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println(">> GymCoach: inside setFortuneService method");
//		this.fortuneService = fortuneService;
//	}

}
