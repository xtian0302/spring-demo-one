package com.xtian0302.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {
//
//	@Override
//	public String getFortune() {
//		First Solution
//		int num = (int)Math.floor(Math.random()*100);
//		
//		if( num%7 == 0)
//			return "Your luckiest day!";
//		else if( num%2 == 0)
//			return "Your lucky day";
//		else
//			return "Not your lucky day";
//	}

	//Better Solution

	// create an array of strings
	private String[] data = { 
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward"
	};
	
	// create a random number generator
	private Random myRandom = new Random();
		
	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}
}
