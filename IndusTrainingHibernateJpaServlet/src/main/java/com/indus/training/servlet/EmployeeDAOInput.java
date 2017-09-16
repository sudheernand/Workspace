package com.indus.training.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeDAOInput
 */
public class EmployeeDAOInput extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeDAOInput() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println(
				"<html>"
				+ "<body>"
				+ "<form action=\"/IndusTrainingHibernateJpaServlet/EmployeeDAOOutput\">"
				+ "<p>Enter ID, and click the \"Submit\" button to send input to theserver.</p>"
				+ "EmployeeID: "
				+ "<input type=\"number\" name=\"EmployeeID\" value=\"10\">"
				+ "<br>"
				+ "<input type=\"submit\" value=\"Submit\"></form>"
				+ "<p>Click the \"Submit\" button and the form-data will"
				+ " be sent to a page on the server called \"/action_page.php\"."
				+ "</p>"
				+ "</body>"
				+ "</html>");
		out.flush();
	}

}
