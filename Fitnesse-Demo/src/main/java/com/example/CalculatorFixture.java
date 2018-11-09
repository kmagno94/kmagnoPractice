package com.example;

import fit.ColumnFixture;

public class CalculatorFixture extends ColumnFixture {
	
	public int n1;
	public int n2;
	
	public int sum() {
		return n1+n2;
	}

	public int product() {
		return n1*n2;
	}
}
