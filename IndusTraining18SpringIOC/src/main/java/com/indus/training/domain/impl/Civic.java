package com.indus.training.domain.impl;

import com.indus.training.domain.spec.IHondaBody;
import com.indus.training.domain.spec.IHondaCar;
import com.indus.training.domain.spec.IHondaEngine;
import com.indus.training.domain.spec.ISeat;
import com.indus.training.domain.spec.ITyre;

public class Civic implements IHondaCar {

	private IHondaBody body;

	private IHondaEngine engine;

	private ISeat[] seats;

	private ITyre[] tyres;

	public Civic() {
		System.out.println("Civic : Constructor");

	}

	public void drive() {
		System.out.println("Civic : Drive");
		body.specification();
		for (ISeat seat : seats) {
			seat.specification();
		}

		for (ITyre tyre : tyres) {
			tyre.specification();
		}
		engine.start();
		engine.acclerate();

	}

	public void stop() {
		System.out.println("Civic : Stops");
		engine.slowDown();
		engine.stop();

	}

	public void start() {

		System.out.println("Civic : Starts");
		engine.start();

	}

	public void acclerate() {
		System.out.println("Civic : Sppeds up");
		engine.acclerate();

	}

	public void setBody(IHondaBody body) {
		this.body = body;
	}

	public void setEngine(IHondaEngine engine) {
		this.engine = engine;
	}

	public void setSeats(ISeat[] seats) {
		this.seats = seats;
	}

	public void setTyres(ITyre[] tyres) {
		this.tyres = tyres;
	}

}
