package com.indus.training.impl;

import com.indus.training.domain.Day;
import com.indus.training.domain.DayEnum;

import junit.framework.TestCase;

public class TestDay extends TestCase {

	public void testDay(){
	

		System.out.println(Day.sunday);;
		Day h = Day.monday;
		System.out.println(h);
		System.out.println(DayEnum.MONDAY);
		

				
	}

}
