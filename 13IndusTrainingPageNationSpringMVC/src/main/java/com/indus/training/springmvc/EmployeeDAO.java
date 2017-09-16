package com.indus.training.springmvc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

public class EmployeeDAO {
	public List<Employee> getDetails(Integer lmt, Integer offset) throws IOException {
		List<Employee> empList = null;

		URL url = new URL(
				"http://localhost:8080/IndusTrainingHibernateJpaServlet/service/getempl/list/" + lmt + "/" + offset);

		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept", "application/json");
		conn.connect();
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String ouput;
		ouput = br.readLine();
		ObjectMapper mapper = new ObjectMapper();
		empList = mapper.readValue(ouput, List.class);
		conn.disconnect();

		return empList;
	}

}
