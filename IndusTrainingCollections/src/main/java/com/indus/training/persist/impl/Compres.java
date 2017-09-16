package com.indus.training.persist.impl;

public class Compres {

	public static void main(String[] args) {
		stcom sobj = new stcom();
		System.out.println(sobj.compresssor("ddffdghjkky"));

	}

}

class stcom {
	public StringBuilder compresssor(String s) {
		int count = 1;
		StringBuilder str = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {

			if (i != s.length()-1 && s.charAt(i) == s.charAt(i + 1)) {
				count = count + 1;

			} else {
				str.append(s.charAt(i));
				str.append(count);
				count = 1;
			}
//			if (i == s.length()-1 && s.charAt(i) == s.charAt(i - 1)){
//				str.append(s.charAt(i));
//				str.append(count);
//				count = 1;
//				
//			}
			
		}

		return str;

	}

}