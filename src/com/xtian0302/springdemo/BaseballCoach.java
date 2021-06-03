package com.xtian0302.springdemo;

public class BaseballCoach implements Coach{
	
	public BaseballCoach() {  
	}

	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) { 
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Do baseball practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
}
