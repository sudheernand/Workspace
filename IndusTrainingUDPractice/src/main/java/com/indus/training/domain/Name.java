package com.indus.training.domain;

public class Name {
	public String first ;
	public String last;
	public String fullName;
	
	public String cocncat (String param1, String param2)
	{
		fullName =param1 + param2;
		
		return fullName;
	}

}
