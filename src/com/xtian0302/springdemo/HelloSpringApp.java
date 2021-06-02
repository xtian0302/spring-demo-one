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
		//invoke methods from bean
		System.out.println(beanCoach.getDailyWorkout());
		System.out.println(tCoach.getDailyWorkout());
		//close context
		context.close();
	}

}
