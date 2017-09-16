package com.indus.training.java;

import com.indus.training.domain.FullName;

import junit.framework.TestCase;

public class TestFullName extends TestCase {

	public void testFullName(){
		FullName nameObj1 =new FullName("sudheer","nand","renukunta");
		FullName nameObj2 =new FullName("sudheer","nand","renukunta");
		System.out.println(nameObj2);
		System.out.println("object equality test:"+(nameObj1==nameObj2));
		double one =10.0;
		double two =10.0;
		System.out.println("object equality test:"+(one==two));
		System.out.println(nameObj1.equals(nameObj2));
		FullName nameObj4 = new FullName ("ram","lad","raf");
		
		}
	}
