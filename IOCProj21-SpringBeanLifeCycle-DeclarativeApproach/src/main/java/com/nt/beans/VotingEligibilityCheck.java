package com.nt.beans;

import java.util.Date;

public class VotingEligibilityCheck {
		//bean properties
		private String name;
		private int age;
		private String addr;
		private Date verifiedOn;
		
		//setter methods for setter injection 
		public void setName(String name) {
			System.out.println("VotingEligibilityCheck.setName(-)");
			this.name = name;
		}
		public void setAge(int age) {
			System.out.println("VotingEligibilityCheck.setAge(-)");
			this.age = age;
		}
		public void setAddr(String addr) {
			System.out.println("VotingEligibilityCheck.setAddr(-)");
			this.addr = addr;
		}
		
		//custom init method
		public void myinit() {
			System.out.println("VotingEligibilityCheck.myinit(-)");
			//initialize lefeover properties
			verifiedOn = new Date();
			if(addr==null)
				addr="not provided";
			//validation logic
			if(name==null)
				throw new IllegalArgumentException("name is required");
			else if(age<=0 || age>=125)
				throw new IllegalArgumentException("Person age must be in the range of 1 through 125");
		}
		
		//b.method
		public String checkVotingCriteria() {
		//b.logic
			if(age<18)
				return "Mr./Miss/Mrs."+name+"("+age+") belongs to "+addr+" is not eligible for voting.--> verified on "+verifiedOn;
			else
				return "Mr./Miss/Mrs."+name+"("+age+") belongs to "+addr+" is eligible for voting.--> verified on "+ verifiedOn;
		}
		
		public void myDestroy() {
			System.out.println("VotingEligibilityCheck.mydestroy(-)");
			//nullify bean properties
			name=null;
			age=0;
			addr=null;
			verifiedOn=null;
		}
}
