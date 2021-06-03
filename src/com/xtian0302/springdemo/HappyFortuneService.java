package com.xtian0302.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		int num = (int)Math.floor(Math.random()*100);
		
		if( num%7 == 0)
			return "Your luckiest day!";
		else if( num%2 == 0)
			return "Your lucky day";
		else
			return "Not your lucky day";
	}

}
