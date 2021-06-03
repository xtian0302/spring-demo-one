package com.xtian0302.springdemo;

public class BasketballCoach implements Coach {

	public BasketballCoach() {
		System.out.println("BasketballCoach: No Arg Constructor - Object initialized");
	}

	private FortuneService fortuneService;
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("BasketballCoach: setting FortuneService Dependency");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Do basketball practice";
	}
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Bball coach predicts : "+fortuneService.getFortune();
	}

}
