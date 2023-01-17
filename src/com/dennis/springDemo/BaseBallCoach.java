package com.dennis.springDemo;

public class BaseBallCoach implements Coach {
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minues on batting practice";
	}
}
