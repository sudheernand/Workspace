package com.indus.training.impl;

public class ColourPoint extends Point {
	private final int z;
	public ColourPoint(int x, int y, int z) {
	super(x, y);
	this.z = z;
	}
	public static void main(String args[]){
		Point p = new Point(2, 2);
		ColourPoint cp = new ColourPoint(2, 2,4);
		System.out.println(cp instanceof Point );
		System.out.println(p instanceof ColourPoint );
		System.out.println(p.equals(cp) );
		cp.fargo(3);
	}
	@Override
	public static void fargo(int x) {
		
		System.out.println("sds");
	}
	
}
