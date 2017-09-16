package com.indus.training.persist.impl;

public class CheckWord {

	public CheckWord() {
	}

	public static void main(String[] args) {
		Checkimplement co = new Checkimplement();
		System.out.println(co.takesword("ghjkllda"));
		Checkimplement co1 = new Checkimplement();
		System.out.println(co1.takesword("ghjklda"));
		System.out.println(co);
		System.out.println(co1);

	}

	public void Checkword() {
	}
}

final class Checkimplement {
	public boolean takesword(String w) {
		
	
		for (int i = 0; i < w.length(); i++) {

			for (int j = i + 1; j < w.length(); j++)
				if (w.charAt(i) != w.charAt(j)) {
				} else {
					return false;
				}
		}
		return true;

	}

}