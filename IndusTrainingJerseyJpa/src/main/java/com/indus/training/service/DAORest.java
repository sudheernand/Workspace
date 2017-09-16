package com.indus.training.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.indus.training.persist.entity.Employee;
import com.indus.training.persist.exception.PersistException;
import com.indus.training.persist.impl.EmployeeDAO;
import com.indus.training.persist.service.IEmployeeDAO;

@Path("/HDAO")
public class DAORest {
	private IEmployeeDAO emplTmObj;
	private ApplicationContext contextObj;

	@GET
	@Path("{id}")
	public Response getUserDetails(@PathParam("id") int id) throws PersistException {
		contextObj = new ClassPathXmlApplicationContext(new String("applicationContext.xml"));

		emplTmObj = (IEmployeeDAO) contextObj.getBean("myDaoBean");
		Employee emp = emplTmObj.select(id);

		// String date = year + "/";

		return Response.status(200).entity("employee firstname is : " + emp.getFirstName()).build();

	}

}
