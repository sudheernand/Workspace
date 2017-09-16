package com.indus.training.ui.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.codehaus.jackson.map.ObjectMapper;

public class EmployeeProcessor {
	private EmployeeId empID;
	private EmployeeDetails empDetails;

	public EmployeeId getEmpID() {
		return empID;
	}

	public void setEmpID(EmployeeId empID) {
		this.empID = empID;
	}

	public EmployeeDetails getEmpDetails() {
		return empDetails;
	}

	public void setEmpDetails(EmployeeDetails empDetails) {
		this.empDetails = empDetails;
	}

	public String getDetails() throws IOException {
		String result = null;
		empDetails = new EmployeeDetails();

		int idn = Integer.parseInt((empID.getId()));
		System.out.println(idn);

		URL url = new URL("http://localhost:8080/IndusTrainingHibernateJpaServlet/service/getempl/" + idn);

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
		// calOut.setResult(
		// Double.toString((Double.parseDouble(calIn.getParam1()) +
		// Double.parseDouble(calIn.getParam2()))));
		empDetails.setFirstName(result);
		return "success";
	}

}
