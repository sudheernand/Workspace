package com.indus.training.domain.impl;

import com.indus.training.domain.spec.IHondaBody;

public class AccordBody implements IHondaBody {

	public AccordBody() {
		System.out.println("AccordBody : Constructor");
	}

	public void specification() {
		System.out.println("AccordBody : Specification : v6, 31/28 , balck,leather");
	}

}
