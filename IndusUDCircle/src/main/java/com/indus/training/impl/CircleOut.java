package com.indus.training.impl;

import com.indus.training.domain.Circle;

public class CircleOut {
	Circle cirObj = new Circle();
	
	 public double  perimeter(double param)
	
	{
		
		
	cirObj.setRadius(param);
	double resultval= 2*(3.14)*cirObj.getRadius();
	return resultval;
	
	
	
	
	}
	public double area (double  param)
	{
		{
			
			
		cirObj.setRadius(param);
		double resultval= (3.14)*cirObj.getRadius()*cirObj.getRadius();
		return resultval;
		
		
		
		
	}
	}
	


}