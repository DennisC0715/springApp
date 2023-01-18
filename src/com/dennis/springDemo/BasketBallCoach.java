package com.dennis.springDemo;

public class BasketBallCoach implements Coach{
	
	//define a private field for the dependency
		private FortuneService fortuneService;
		
		//define a constructor for dependency
		public BasketBallCoach(FortuneService thefortuneService){
			this.fortuneService = thefortuneService;
		}
	
	public String getDailyWorkout() {
		return "play basketball for 1 hour";
	}

	@Override
	public String getDailyFortune() {
		return "just do it" + fortuneService.getFortune();
	} 
}
