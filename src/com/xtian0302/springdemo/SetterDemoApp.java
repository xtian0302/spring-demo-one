package com.xtian0302.springdemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) { 
		//Load spring context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from context
		
		//must be casted as Class that implements interface or casted as itself but not a class casted as it's interface
		Coach bball = context.getBean("bCoach",BasketballCoach.class);
		BasketballCoach bball2 = context.getBean("bCoach",BasketballCoach.class);
		Coach bball3 = context.getBean("bCoach",Coach.class);
		//but not
		//BasketballCoach bball3 = context.getBean("bCoach",Coach.class);
		List<Coach> coaches = new ArrayList<Coach>();
		coaches.add(bball);
		coaches.add(bball2);
		coaches.add(bball3);
		
		//call bean methods - essentially calling 3 instances of the same class
		for (Coach coach : coaches) {
			System.out.println(coach.getDailyWorkout());
			System.out.println(coach.getDailyFortune()); 
		}
		
		// Only basketball coach has methods for emailaddress/team get
		// need to add to coach interface it we want this implemented for all coach classes
		// wont work for bball / bball3 objects as they are casted as Coach class
		System.out.println("\nEmail: "+bball2.getEmailAddress()+"\nTeam: "+bball2.getTeam());
		//close context
		context.close();
	}

}
