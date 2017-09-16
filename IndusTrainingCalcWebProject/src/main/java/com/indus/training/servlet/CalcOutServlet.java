package com.indus.training.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcOutServlet
 */
public class CalcOutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CalcOutServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String result = (String) request.getAttribute("inResult");
		PrintWriter out = response.getWriter();
		out.println("<html><body><form action=\"/IndusTrainingCalcWebProject/CalcServlet\">Result: "
				+ "<input type=\"number\" name=\"Result\" value=" + result
				+ "><input type=\"submit\" value=\"Return\"></form>"
				+ "<p>Click the \"Submit\" button and the form-data will be sent to a page "
				+ "on the server called \"/IndusTrainingCalcWebProject/CalcServlet\".</p></body></html>");
		out.flush();
	}

}
