package com.indus.training.springmvc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.codehaus.jackson.map.ObjectMapper;

public class EmployeeDAO {
	
	
	public String getDetails(int id) throws IOException {

		URL url = new URL("http://localhost:8080/IndusTrainingHibernateJpaServlet/service/getempl/" + id);

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
		String result = empObj.getFirstName();
		return result;
	}

}
