package com.indus.training.service;

public class Practice {

	public static void main(String[] args) {
		Practice obj1 = new Practice();
		// TestA obj2 = obj1.new TestA();
		TestA.output();
		// obj2.output();

	}

	 static  class TestA {
		static int v = 1;

		public static void output() {
			 int i =10;
			 int j = 20;
			 int k = i+j;
			System.out.println(k);
		}
	}}

	class TestB {
		public static void output() {
			System.out.println("hi");
		}
	}

