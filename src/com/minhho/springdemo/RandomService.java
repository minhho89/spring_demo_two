package com.minhho.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Random Service";
	}

}
