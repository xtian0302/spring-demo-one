package com.xtian0302.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coach bCoach = new BaseballCoach();
		System.out.println(bCoach.getDailyWorkout());
		Coach basketCoach = new BasketballCoach();
		System.out.println(basketCoach.getDailyWorkout());
		Coach tCoach = new TrackCoach();
		System.out.println(tCoach.getDailyWorkout());
	}

}
