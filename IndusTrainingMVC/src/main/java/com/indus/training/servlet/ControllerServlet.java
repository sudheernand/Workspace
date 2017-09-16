package com.indus.training.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.indus.training.domain.CalcInputs;
import com.indus.training.domain.CalcOutputs;
import com.indus.training.service.Calculator;

/**
 * Servlet implementation class ControllerServlet
 */
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ControllerServlet() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		CalcInputs calInObj = (CalcInputs) request.getAttribute("calInObj");
		Calculator calObj = new Calculator();
		CalcOutputs calOutObj = null;
		calOutObj = calObj.add(calInObj);

		request.setAttribute("calOutObj", calOutObj);
		RequestDispatcher reqObj = request.getRequestDispatcher("/view/CalcOutput.jsp");
		reqObj.forward(request, response);
	}

}
