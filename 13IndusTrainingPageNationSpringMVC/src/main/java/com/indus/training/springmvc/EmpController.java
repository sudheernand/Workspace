package com.indus.training.springmvc;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpController {

	@RequestMapping("/viewemp/{pageid}")
	public ModelAndView edit(@PathVariable Integer pageid) throws IOException {
		int lmt = 10;
		int offset = 0;
		if (pageid == 1) {
		} else {
			offset = (pageid - 1) * lmt + 1;
		}

		EmployeeDAO dao = new EmployeeDAO();
		List<Employee> list = dao.getDetails(lmt, offset);

		return new ModelAndView("details", "list", list);
	}

}
