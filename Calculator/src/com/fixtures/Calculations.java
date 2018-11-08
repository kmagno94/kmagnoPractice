package com.fixtures;

import com.example.SimpleCalculator;

public class Calculations {
	
	SimpleCalculator calc = new SimpleCalculator();
		
	private double n1,n2;

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}
	
	public double sum() {
		return calc.add(n1, n2);
	}
	
	public double difference() {
		return calc.subtract(n1, n2);
	}
	
	public double product() {
		return calc.multiply(n1, n2);
	}
	
	public double quotient() {
		return calc.divide(n1, n2);	
	}
}
