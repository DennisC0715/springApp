package com.dennis.springDemo;

public class TrackCoach implements Coach {
	
	public TrackCoach() {
		
	}
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	
	//add an init method
	public void doMyStartupStuff() {
		System.out.println("trackcoach: inside init method");
	}
	
	//add a destroy method
	public void doMycleanupStuff() {
		System.out.println("trackcoach: inside destroy method");
	}
}
