package com.indus.training.persist.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.indus.training.persist.IEmployeeDAO;
import com.indus.training.persist.entity.Employee;
import com.indus.training.persist.exception.PersistException;

public class EmployeeDAO implements IEmployeeDAO {

	private SessionFactory sessionFactory;

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Employee select(Integer empId) throws PersistException {

		Employee empObj = null;

		if (empId == null) {
			throw new PersistException("Employee Object cannot be null");
		}

		Session sessionObj = sessionFactory.openSession();

		Transaction transObj = sessionObj.beginTransaction();
		try {
			empObj = (Employee) sessionObj.get(Employee.class, empId);

			transObj.commit();

			System.out.println(empObj.toString());

		} catch (Exception ex) {
			try {
				transObj.rollback();
			} catch (IllegalStateException illegStateEx) {
				illegStateEx.printStackTrace();
			}
			throw new PersistException("Exception must be handled", ex);
		} finally {
			if (transObj != null) {
				transObj = null;
			}
			if (sessionObj != null) {
				sessionObj.clear();
			}
		}

		return empObj;
	}

	public Boolean delete(Employee empObj) throws PersistException {
		return null;
	}

	public Boolean update(Employee empObj) throws PersistException {
		return null;
	}

	public Boolean insert(Employee empObj) throws PersistException {
		return null;
	}

	
}
