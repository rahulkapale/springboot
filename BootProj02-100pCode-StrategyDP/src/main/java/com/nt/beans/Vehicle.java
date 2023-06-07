package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
// All Spring beans are taken as final class (StrategyDP Rule#3)
public final class Vehicle {
	@Autowired  // for dependency injection
	@Qualifier("engineType")
	private Engine engg;  //HAS-A property (Composition: StrategyDP Rule#1 )
				//HAS-A property type is interface type StrategyDP Rule#2
				//All Dependent classes are implementing common interface StrategyDP Rule#2
	public Vehicle() {
		System.out.println("Vehicle:: 0-param constructor");
	}
	
	//b.method using the dependent
	public void journey(String startPlace, String destPlace) {
		engg.start();
		System.out.println("Vehicle:: Journey Started from:: "+startPlace);
		System.out.println("journey is going on.....");
		engg.stop();
		System.out.println("Vehicle:: Journey Stopped at:: "+destPlace);
	}
}
