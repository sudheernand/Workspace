package com.indus.training.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.indus.training.persist.entity.Employee;
import com.indus.training.persist.exception.PersistException;
import com.indus.training.persist.impl.EmployeeDao;
import com.indus.training.persist.service.IEmployeeDAO;

@Path("/getempl")
public class DAORest {
	private IEmployeeDAO emplTmObj;
	private ApplicationContext contextObj;

	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getUserDetails(@PathParam("id") Integer id) throws PersistException {

		contextObj = new ClassPathXmlApplicationContext(new String("applicationContext.xml"));

		emplTmObj = (IEmployeeDAO) contextObj.getBean("myDaoBean");

		Employee emp = emplTmObj.select(id);

		System.out.println(emp.toString());

		return emp;
	}

	@GET
	@Path("list/{lmt}/{offset}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> find(@PathParam("lmt") Integer lmt, @PathParam("offset") Integer offset) {
		List<Employee> empList = null;
		System.out.println(lmt);
		System.out.println(offset);
		EmployeeDao daoObj = new EmployeeDao();
		empList = daoObj.readUsingNamedQuery(lmt, offset);
		return empList;

	}
}
