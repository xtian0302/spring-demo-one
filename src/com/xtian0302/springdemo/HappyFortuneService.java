package com.xtian0302.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		if(Math.floor(Math.random())%2 == 0)
			return "Your lucky day";
		else
			return "Not your lucky day";
	}

}
