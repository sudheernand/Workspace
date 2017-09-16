package com.indus.training.domain;

public class Conversions implements IConversions {
	 public  double convCF( double param) {
		 double   mul = 1.8;
		double add = 32;
		return (param*mul)+add;

	}
	public double convFC(double param) {
		double mul = 1.8;
		double add = 32;
		return (param-add)/mul;

	}
}