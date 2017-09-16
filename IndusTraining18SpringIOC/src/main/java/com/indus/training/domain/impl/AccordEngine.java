package com.indus.training.domain.impl;

import com.indus.training.domain.spec.IHondaEngine;

public class AccordEngine implements IHondaEngine {

	public AccordEngine() {
		
		System.out.println("AccordEngine : Constructor");
	}

	public void stop() {
		System.out.println("AccordEngine : stops");
	}

	public void start() {
		System.out.println("AccordEngine : starts");
	}

	public void slowDown() {
		System.out.println("AccordEngine : slowsDown");
	}

	public void acclerate() {
		System.out.println("AccordEngine : speeds up");
	}

}
