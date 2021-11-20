package com.fitness;

public abstract class Makeham_abs {
	private int A,B,C;
	private double prob(int age) {
		return 1-Math.exp(-A*age-B*(Math.pow(C, age)-1)/Math.log(C));
	}
}
