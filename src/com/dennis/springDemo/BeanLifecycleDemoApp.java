package com.dennis.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");
		
		//retrieve bean from spring container
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		
		
		System.out.println(theCoach.getDailyFortune()+ ", "+theCoach.getDailyWorkout());
		
		context.close();
	}

}
