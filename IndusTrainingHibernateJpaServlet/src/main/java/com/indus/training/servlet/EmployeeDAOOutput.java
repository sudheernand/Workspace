
package com.indus.training.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import com.indus.training.persist.entity.Employee;

/**
 * Servlet implementation class EmployeeDAOOutput
 */
public class EmployeeDAOOutput extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployeeDAOOutput() {
		super();
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
		// Integer id = (int)
				// Double.parseDouble(request.getParameter("EmployeeID"));

				// ApplicationContext contextObj = new
				// ClassPathXmlApplicationContext(new String("applicationContext.xml"));
				// IEmployeeDAO emplTmObj = (IEmployeeDAO)
				// contextObj.getBean("myDaoBean");
				// String result = null;
				// try {
				// result = emplTmObj.select(id).getFirstName();
				// } catch (PersistException e) {
				// e.printStackTrace();
				// }
		Integer empID = Integer.parseInt(request.getParameter("EmployeeID"));
		
		URL url = new URL("http://localhost:8080/IndusTrainingHibernateJpaServlet/service/getempl/"+empID);
		
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

				PrintWriter out = response.getWriter();
		out.println("<html><body>"
				+ "<form action=\"/IndusTrainingHibernateJpaServlet/EmployeeDAOInput\">"
				+ "<p>Enter ID, and click the \"Submit\" button to send input to theserver.</p>"
				+ "Result:"+empObj+ "<br>"
				+ "<input type=\"submit\" value=\"Submit\">"
				+ "</form>"
				+ "<p>Click the \"Submit\" button and the form-data will"
				+ " be sent to a page on the server called \"/action_page.php\".</p></body></html>");
		out.flush();
	}
}
