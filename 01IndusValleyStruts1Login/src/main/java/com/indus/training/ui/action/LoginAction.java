package com.indus.training.ui.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.indus.training.ui.model.LoginForm;

public class LoginAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		
		 LoginForm loginForm = (LoginForm) form;
		 
		 	System.out.println(loginForm.getUserName());
		 	System.out.println(loginForm.getPassWord());
		 
	        if (loginForm.getUserName() == null || loginForm.getPassWord() == null
	                || !loginForm.getUserName().equalsIgnoreCase("Mukesh")
	                || !loginForm.getPassWord().equals("kumar")) {
	            return mapping.findForward("success");
	        } else
	            return mapping.findForward("failure");
	    }
	 
	}
	

