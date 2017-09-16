package com.indus.training.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import com.indus.training.persist.entity.Employee;

/**
 * Servlet implementation class EmpInterServlet
 */
public class EmpInterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EmpInterServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String param1 = request.getParameter("ID");

		String result = null;

		URL url = new URL("http://localhost:8080/IndusTrainingHibernateJpaServlet/service/getempl/" + param1);

		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept", "application/json");
		conn.connect();
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String ouput;
		ouput = br.readLine();
		ObjectMapper mapper = new ObjectMapper();
		Employee empObj = mapper.readValue(ouput, Employee.class);
		conn.disconnect();
		result = empObj.getFirstName();
		request.setAttribute("inResult", result);
		RequestDispatcher reqObj = request.getRequestDispatcher("EmpInterServlet");
		reqObj.forward(request, response);
	}

}
