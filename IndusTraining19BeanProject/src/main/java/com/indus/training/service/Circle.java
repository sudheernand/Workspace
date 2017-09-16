package com.indus.training.service;

import com.indus.training.domain.CircleIn;

public class Circle {
	CircleIn cirObj = new CircleIn();

	public double perimeter(CircleIn cirInObj)

	{

		
		double resultval = 2 * (3.14) * cirInObj.getRadius();
		return resultval;

	}

	public double area(double param) {
		{

			cirObj.setRadius(param);
			double resultval = (3.14) * cirObj.getRadius() * cirObj.getRadius();
			return resultval;

		}
	}

}
