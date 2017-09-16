package com.indus.training.persist.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.indus.training.persist.entity.Employee;
import com.indus.training.persist.exception.PersistException;
import com.indus.training.persist.service.IEmployeeDAO;

@Service
public class EmplTM implements IEmployeeDAO {

	@PersistenceContext
	private EntityManager entityMan;

	@Transactional
	public Employee select(Integer id) {
		Employee empObj = null;
		System.out.println(id);
		Query qry = entityMan.createNativeQuery("SELECT * FROM employees WHERE employee_id ="+id,Employee.class);

		empObj = (Employee) qry.getSingleResult();
		System.out.println(empObj.getFirstName());
		System.out.println("fgf");

		return empObj;
	}

	public boolean create(Employee empDetailsObj) throws PersistException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean update(Employee empDetailsObj) throws PersistException {
		// TODO Auto-generated method stub
		return false;
	}

}
