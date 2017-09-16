package com.indus.training.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.indus.training.persist.exception.PersistException;
import com.indus.training.persist.service.IEmployeeDAO;

@Path("/HDAO")
public class DAORest {
	private IEmployeeDAO DAOObj = null;
	private ApplicationContext context = new ClassPathXmlApplicationContext(
			new String[] { "HibernateSpringifyIoc.xml" });

	@GET
	@Path("{id}")
	public Response getUserDetails(@PathParam("id") int id) {
		DAOObj = (IEmployeeDAO) context.getBean("employeeDAOBean");
		String empDetails = null;

		try {
			empDetails = DAOObj.select(id).getFirstName();
		} catch (PersistException e) {
			e.printStackTrace();
		}

		// String date = year + "/";

		return Response.status(200).entity("emplfhogyee details are : " + empDetails).build();

	}

}
