package com.xtian0302.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//load spring config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean
		Coach beanCoach = context.getBean("myCoach",Coach.class);
		Coach tCoach = context.getBean("tCoach",Coach.class);
		Coach bballCoach = context.getBean("bCoach",Coach.class);
		//invoke methods from bean
		System.out.println(beanCoach.getDailyWorkout());
		System.out.println(beanCoach.getDailyFortune());
		
		System.out.println(tCoach.getDailyWorkout());
		System.out.println(tCoach.getDailyFortune());

		System.out.println(bballCoach.getDailyWorkout());
		System.out.println(bballCoach.getDailyFortune());
		//close context	
		context.close();
	}

}
