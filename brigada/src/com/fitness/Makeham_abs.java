package com.fitness;

public abstract class Makeham_abs {
	private double A,B,C;
	Makeham_abs(double A,double B,double C){
		this.A=A;
		this.B=B;
		this.C=C;
	}
	public double Calculate(int age) {
		return 1-Math.exp(-A*age-B*(Math.pow(C, age)-1)/Math.log(C));
	}
}
