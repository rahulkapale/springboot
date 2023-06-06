package com.nt.test;

import java.time.LocalDateTime;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.WishMessageGenerator;
import com.nt.config.AppConfig;

public class DependencyManagementTest {

	public static void main(String[] args) {
		//create IOC container
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		//get target class object
		WishMessageGenerator generator =ctx.getBean("wishMessageGenerator",WishMessageGenerator.class);
		//invoke the business method
		String result=generator.generateWishMessage("rahul");
		System.out.println(result);
		
		System.out.println("==================");
		LocalDateTime ldt = ctx.getBean("createLDT",LocalDateTime.class);
		System.out.println(ldt);
		//close IOC container
		ctx.close();
	
	}//main
} 
