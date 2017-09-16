package com.indus.training.persist.impl;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.indus.training.persist.entity.Employee;
import com.indus.training.persist.exception.PersistException;
import com.indus.training.persist.service.IEmployeeDAO;

public class Test {

	public static void main(String[] args) throws PersistException {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
		IEmployeeDAO eObj = (IEmployeeDAO) context.getBean("myDaoBean");
		System.out.println(eObj.select(120));
		// EmployeeDao empDAOObj = new EmployeeDao();
		// List<Employee> empActObj = null;
		//
		// empActObj = empDAOObj.readUsingNamedQuery(10, 1);
		//
		// for (Employee i : empActObj) {
		// System.out.println(i);
		// }
		//
	}

}
