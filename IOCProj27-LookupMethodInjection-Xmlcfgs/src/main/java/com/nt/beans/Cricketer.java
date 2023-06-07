package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public abstract class Cricketer{	
	
	public Cricketer() {
		System.out.println("Cricketer:: 0- param constructor"+this.getClass());
	}
	
	public void bowling() {
		System.out.println("Cricketer is bowling");
	}
	
	public abstract Bat createBat(); //this method implemented in 
														//the inMemory proxy class of this class having
														//dependency lookup logic
	
	public void batting() {
		System.out.println("Cricketer is bating");
		//get dependent class object
		Bat bat=createBat();
	
		int score=bat.scoreRuns();
		System.out.println("Cricketer batting score is::"+score);
	}
	
	public void fielding() {
		System.out.println("Cricketer is fielding");
	}
	
	public void wicketKeeping() {
		System.out.println("Cricketer is keeping the wicket");
	}

	
	
}
