package com.nt.beans;

import java.time.LocalDateTime; //ctrl+shift+O for importing pkgs

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("wmg")  // spring bean configure having "wmg" as bean id
@Component
public class WishMessageGenerator {
		//HAS-A Property
		@Autowired		//annotation marking HAS-A Property for dependency Injection/ Management 
		private LocalDateTime ldt;	  //by default holds null...after injection/wiring null will be replaced 
														//with dependent LocalDateTime class object
		
		
		public WishMessageGenerator() {
			System.out.println("WishMessageGenerator:: 0 param constructor");
		}
		
		//b.method
		public String generateWishMessage(String user) {
			System.out.println(ldt);
			//get current hour
			int hour = ldt.getHour();
			//write business logic
			if(hour<=12)
				return "GM "+user;
			else if(hour<16)
				return "GA "+user;
			else if(hour<20)
				return "GE "+user;
			else
				return "GN "+user;	
		}
														

		
}
