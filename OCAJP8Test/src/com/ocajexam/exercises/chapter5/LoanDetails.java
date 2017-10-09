package com.ocajexam.exercises.chapter5;

public class LoanDetails {
	private int term;
	private double rate;
	private double principal;
	
	public LoanDetails() {
		this(180, 0.025, 0);
	}
	
	public LoanDetails(int term, double rate, double principal) {
		this.term = term;
		this.rate = rate;
		this.principal = principal;
	}

	public void setPrincipal(double p) {
		principal = p;
	}
	
	public double monthlyPayment() {
		return (rate * principal / 12) / (1.0 - Math.pow(((rate / 12) + 1.0), (-term)));
	}
	
	public void printMonthlyPayment() {
		System.out.print("Payment " + this.monthlyPayment());
	}
	
}
