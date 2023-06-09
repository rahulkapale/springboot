package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("cktr")
public class Cricketer implements ApplicationContextAware{
	private ApplicationContext ctx;
		
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		 	System.out.println("Cricketer.setApplicationContext()");
		 	this.ctx=ctx;
	}
	
	public Cricketer() {
		System.out.println("Cricketer:: 0- param constructor");
	}
	
	public void bowling() {
		System.out.println("Cricketer is bowling");
	}
	
	public void batting() {
		System.out.println("Cricketer is bating");
		//perform dependency lookup method to get dependency class object 
		Bat bat=ctx.getBean("bat",Bat.class); //DL code
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
