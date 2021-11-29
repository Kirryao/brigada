package com.fitness;

public class IntegralDeathProb extends Makeham_abs{
		static double A = 0.00022;
		static double B = 2.7*Math.pow(10,-6);
		static double C =1.124;
		IntegralDeathProb() {
			super(A,B,C);
		}
}