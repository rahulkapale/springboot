package com.nt.beans;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("voting")
@PropertySource("com/nt/commons/info.properties")
public class VotingEligibilityCheck {
		//bean properties
	@Value("${per.name}")
		private String name;
	@Value("${per.age}")
		private int age;
	@Value("${per.addr  }")
		private String addr;
		private Date verifiedOn;
		
		
		
		//custom init method
		@PostConstruct
		public void custInit() {
			System.out.println("VotingEligibilityCheck.custInit(-)");
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
		
		@PreDestroy
		public void custDestroy() {
			System.out.println("VotingEligibilityCheck.custDestroy(-)");
			//nullify bean properties
			name=null;
			age=0;
			addr=null;
			verifiedOn=null;
		}
}
