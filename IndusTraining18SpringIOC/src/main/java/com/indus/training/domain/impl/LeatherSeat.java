package com.indus.training.domain.impl;

import com.indus.training.domain.spec.ISeat;

public class LeatherSeat implements ISeat {

	public LeatherSeat() {
		System.out.println("LeatherSeat : Constructor");
	}

	public void specification() {
		System.out.println("LeatherSeat : specification : Black leather: Bucket Seat");

	}

}
