package com.indus.training.persist.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.indus.training.persist.entity.Employee;
import com.indus.training.persist.exception.PersistException;
import com.indus.training.persist.service.IEmployeeDAO;
import com.indus.training.utils.HibernateUtil;

public class EmployeeDAO implements IEmployeeDAO {

	public Employee select(Integer id) throws PersistException {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();

		Employee details = null;

		try {
			details = (Employee) session.get(Employee.class, id);

			transaction.commit();
			System.out.println(details.toString());

		} catch (Exception ex) {
			transaction.rollback();
			throw new PersistException("persist exception",  ex);
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

	public boolean create(Employee empDetailsObj) throws PersistException {

		if (empDetailsObj == null) {
			throw new PersistException("employee cant be null");
		}

		
		if (empDetailsObj.getHireDate() == null) {
			throw new PersistException("hiredate cant be null");
		}
		if (empDetailsObj.getCommissionPct() == null) {
			throw new PersistException("commisionpct cant be null");
		}
		if (empDetailsObj.getEmployeeId() == null) {
			throw new PersistException("EmployeeID cant be null");
		}
		if (empDetailsObj.getDepartmentId() == null) {
			throw new PersistException("getdeaprtment cant be null");
		}
		if (empDetailsObj.getEmail() == null) {
			throw new PersistException("email cant be null");
		}
		if (empDetailsObj.getHireDate() == null) {
			throw new PersistException("hiredate cant be null");
		}
		if (empDetailsObj.getJobID() == null) {
			throw new PersistException("hiredate cant be null");
		}
		if (empDetailsObj.getPhoneNumber() == null) {
			throw new PersistException("hiredate cant be null");
		}
		if (empDetailsObj.getManagerId() == null) {
			throw new PersistException("hiredate cant be null");
		}

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();

		try {
			session.save(empDetailsObj);

			transaction.commit();

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

		return false;
	}

	public boolean update(Employee empDetailsObj) {
		return false;
	}

}