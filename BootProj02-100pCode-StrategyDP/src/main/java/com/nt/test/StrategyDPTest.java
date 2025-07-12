package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.Vehicle;
import com.nt.config.AppConfig;

public class StrategyDPTest {

	public static void main(String[] args) {
		//create IOC Container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("====================================");
		//get target class object
		Vehicle vehicle=ctx.getBean("vehicle",Vehicle.class);
		//invoke method
		vehicle.journey("pune","Goa");
		
		//close container
		ctx.close();
	}

}
