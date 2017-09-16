package com.indus.training.domain.impl;

import com.indus.training.domain.spec.ITyre;

public class GoodYear implements ITyre {

	public GoodYear() {
		System.out.println("Good year : Constructor");
	}

	public void specification() {
		System.out.println("Good Year : Specification : 250/34 45h");
	}

}
