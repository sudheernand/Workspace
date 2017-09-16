package com.indus.training.domain.impl;

import com.indus.training.domain.spec.IHondaEngine;

public class CivicEngine implements IHondaEngine {

	public CivicEngine() {
		
		System.out.println("CivicEngine : Constructor");
	}

	public void stop() {
		System.out.println("CivicEngine : stops");
	}

	public void start() {
		System.out.println("CivicEngine : starts");
	}

	public void slowDown() {
		System.out.println("CivicEngine : slowsDown");
	}

	public void acclerate() {
		System.out.println("CivicEngine : speeds up");
	}

}
