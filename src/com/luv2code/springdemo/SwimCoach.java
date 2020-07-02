package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("swimCoach")
public class SwimCoach implements Coach {

	//Autowired for Field Injection by Annotations
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Hey Keep Pratices daily";
	}

	@Override
	public String getDailyFortune() {
		System.out.println("in fortune method");
		return fortuneService.getForune();
	}

	/*
	 * // Autowired for Method Injection by Annotations
	 * 
	 * @Autowired public void doSomeCrazyStuff(FortuneService theFortuneService) {
	 * System.out.println("Inside doSomeCrazyStuff"); fortuneService =
	 * theFortuneService; }
	 */

	/*
	 * // Autowired for Setter Injection by Annotations
	 * 
	 * @Autowired public void setFortuneService(FortuneService thefortuneService) {
	 * System.out.println("Inside setFortuneService"); fortuneService =
	 * thefortuneService; }
	 */

	/*
	 * // Autowired for constructor by Annotations //@Autowired public
	 * TennisCoach(FortuneService thefortuneService) { fortuneService =
	 * thefortuneService; }
	 */

}
