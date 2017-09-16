package com.indus.training.persist.impl;

public class Com {

	public static void main(String[] args) {
		tert tobj = new tert();
		tobj.method();

	}

}
class tert{
	public void method(){
		int sum = 1;
		for (int i = 0;i<100;i++){
			sum = sum+1;
			System.out.println(sum);
		}

		
	}
	
}