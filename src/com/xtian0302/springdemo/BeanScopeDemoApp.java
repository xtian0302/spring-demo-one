package com.xtian0302.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load context
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		//retrieve bean
		
		Coach theCoach = context.getBean("tCoach",Coach.class);

		Coach alphaCoach = context.getBean("tCoach",Coach.class);
		
		//check if both are same
		boolean result = (theCoach==alphaCoach);
		
		System.out.println("\n Same object? : "+result);
		System.out.println("\n Memory Loc + theCoach: " +theCoach);
		System.out.println("\n Memory Loc + alphaCoach: " +alphaCoach);
		
		//close context
		context.close();
	}

}
