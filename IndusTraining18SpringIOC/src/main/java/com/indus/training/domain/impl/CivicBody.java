package com.indus.training.domain.impl;

import com.indus.training.domain.spec.IHondaBody;

public class CivicBody implements IHondaBody {

	public CivicBody() {
		System.out.println("CivicBody : Constructor");
	}

	public void specification() {
		System.out.println("CivicBody : Specification : v6, 31/28 , balck,leather");
	}

}
