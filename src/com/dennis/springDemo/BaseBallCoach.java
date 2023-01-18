package com.dennis.springDemo;

public class BaseBallCoach implements Coach {
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency
	public BaseBallCoach(FortuneService thefortuneService){
		this.fortuneService = thefortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minues on batting practice";
	}

	@Override
	public String getDailyFortune() {
		
	//use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}
}
