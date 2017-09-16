package com.indus.training.springmvc;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpController {

	@RequestMapping("/viewemp")
	public ModelAndView helloWorld(HttpServletRequest request, HttpServletResponse res) throws IOException {

		int param1 = Integer.parseInt(request.getParameter("ID"));
		System.out.println(param1);
		EmployeeDAO dao = new EmployeeDAO();
		String firstName = dao.getDetails(param1);
		System.out.println(firstName);
		return new ModelAndView("details", "firstName", firstName);
	}

}
