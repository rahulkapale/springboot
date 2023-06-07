package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.VotingEligibilityCheck;

public class BeanLifeCycleTest {

	public static void main(String[] args) {
		//create IOC container
		ClassPathXmlApplicationContext  ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Spring bean class object
		VotingEligibilityCheck voting = ctx.getBean("voting",VotingEligibilityCheck.class);
		//invoke the business method
		System.out.println(voting.checkVotingCriteria());
		
		//close IOC Container
		ctx.close();
	}

}
