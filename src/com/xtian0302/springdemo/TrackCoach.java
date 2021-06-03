package com.xtian0302.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() { 
	}

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Do track practices";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Track Coach says :"+fortuneService.getFortune();
	}

}
