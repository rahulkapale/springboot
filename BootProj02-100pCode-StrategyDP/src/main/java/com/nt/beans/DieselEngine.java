package com.nt.beans;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("diesel")
//@Primary
public final class DieselEngine implements Engine {
	
	public DieselEngine() {
		System.out.println("DieselEngine - 0 param constructor");
	}
	
	@Override
	public void start() {
		System.out.println("Diesel Engine:: Engine Started");
	}

	@Override
	public void stop() {
		System.out.println("Diesel Engine:: Engine Stopped");
	}
	
}
