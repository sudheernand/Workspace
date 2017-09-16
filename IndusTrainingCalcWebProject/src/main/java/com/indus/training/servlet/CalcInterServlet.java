package com.indus.training.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcInterServlet
 */
public class CalcInterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 */
	public CalcInterServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Double p1 = Double.parseDouble(request.getParameter("Input1"));
		Double p2 = Double.parseDouble(request.getParameter("Input2"));
		double result = p1 + p2;
		String res = result + "";
		request.setAttribute("inResult", res);
		RequestDispatcher reqObj = request.getRequestDispatcher("CalcOutServlet");
		reqObj.forward(request, response);

	}

}
