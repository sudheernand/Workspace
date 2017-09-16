package com.indus.training.persist.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.indus.training.persist.entity.Employee;
import com.indus.training.persist.exception.PersistException;
import com.indus.training.persist.service.IEmployeeDAO;

public class EmployeeDAO implements IEmployeeDAO{
	
	
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Employee select(Integer id) throws PersistException {

		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();

		Employee details = null;

		try {
			details = (Employee) session.get(Employee.class, id);

			transaction.commit();
			System.out.println(details.toString());

		} catch (Exception ex) {
			transaction.rollback();
			throw new PersistException("persist exception", ex);
		}

		finally {
			if (transaction != null) {
				transaction = null;
			}

			if (session != null) {
				session.clear();
			}
		}

		return details;

	}

}