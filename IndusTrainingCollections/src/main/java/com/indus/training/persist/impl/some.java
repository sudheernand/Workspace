package com.indus.training.persist.impl;

public class some {
public int a =5 ;
	public static void main(String[] args) {
		one obj = new one();

		System.out.println(obj.name.hashCode());
		System.out.println(obj.bame.hashCode());

	}

}

class one {
	
	String name = "qaz";
	String bame = name;
}
