package com.fitness;

public abstract class Makeham_abs {
	private double A,B,C;
	Makeham_abs(double A,double B,double C){
		this.A=A;
		this.B=B;
		this.C=C;
	}
	interface Operationable{
	    double Calculate(int age);
	}
	
	public double Calculate(int age) {
		Operationable operation;
        operation = (x)->(1-Math.exp(-A*x-B*(Math.pow(C, x)-1)/Math.log(C)));
        
        
         
		return operation.Calculate(age);
	}
}
