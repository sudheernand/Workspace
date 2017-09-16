package com.indus.training.ui.model;

import com.opensymphony.xwork2.ActionSupport;

public class LinkAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5455623117197875739L;
	
	
	public String welcome()
	{
		return "welcome";		
	}
	
	public String friends()
	{
		return "friends";		
	}
	
	public String office()
	{
		return "office";		
	}
}
