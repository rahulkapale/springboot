package com.nt.service;

public class BankService {
	public double	 calcInterestAmount(double pamt, double rate, double time) {
		System.out.println("BankService.calcInterestAmount() - (Compound Interest)");
		 //calculate compound interest amount
			return (pamt*Math.pow(1+rate/100, time))-pamt;
	}
}
