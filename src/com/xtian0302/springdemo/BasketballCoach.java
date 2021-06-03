package com.xtian0302.springdemo;

public class BasketballCoach implements Coach {

	private FortuneService fortuneService;
	
	private String emailAddress;
	
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setEmailAddress(String emailAddress) {
		System.out.println("BasketballCoach: setting Email Address");
		this.emailAddress = emailAddress;
	}
	
	public String getTeam() {
		return team;
	}
	
	public void setTeam(String team) {
		System.out.println("BasketballCoach: setting Team");
		this.team = team;
	}

	public BasketballCoach() {
		System.out.println("BasketballCoach: No Arg Constructor - Object initialized");
	}
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
