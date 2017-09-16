package com.indus.training.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServlet
 */
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public CalcServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println(
				"<html><body><form action=\"/IndusTrainingCalcWebProject/CalcInterServlet\">"
				+ "Input1: <input type=\"number\" name=\"Input1\" value=\"10\"><br>"
				+ "Input2: <input type=\"number\" name=\"Input2\" value=\"20\"><br>"
				+ "<select name=\"operation\"><option value=\"addition\">add</option>"
				+ "<option value=\"substraction\">substract</option>"
				+ "<option value=\"multiplication\">multiply</option>"
				+ "<option value=\"division\">divide</option></select>"
				+ "<input type=\"submit\" value=\"Submit\"></form>"
				+ "<p>Choose a operation, and click the \"Submit\" button to send input to theserver.</p>"
				+ "<p>Click the \"Submit\" button and the form-data will be sent to apage on the server called \"/action_page.php\".</p>"
				+ "</body></html>");
		out.flush();
	}

}
