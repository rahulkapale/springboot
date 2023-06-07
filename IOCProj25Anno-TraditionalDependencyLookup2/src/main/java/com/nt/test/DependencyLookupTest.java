package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Cricketer;

public class DependencyLookupTest {

	public static void main(String[] args) {
		// create IOC Container
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get target class object
		Cricketer player=ctx.getBean("cktr",Cricketer.class);
		//invoke methods
		player.batting();
		player.bowling();
		player.fielding();		
		player.wicketKeeping();
	}//main
}//class
