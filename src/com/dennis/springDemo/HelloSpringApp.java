package com.dennis.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean form spring container
		Coach theCoach = context.getBean("myBasketBall", Coach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
	
	
		//let us call our new method off fortune
		System.out.println(theCoach.getDailyFortune());
		
		
		//close the context
		context.close();

	}

}
