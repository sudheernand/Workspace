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
		Employee details = null;

		Session emplSession = HibernateUtil.getSessionFactory().openSession();
		Transaction emplTrans = emplSession.beginTransaction();

		try {

			details = (Employee) emplSession.get(Employee.class, id);
			emplTrans.commit();
			// System.out.println(details);

		} catch (Exception ex) {
			emplTrans.rollback();
			throw new PersistException("persist exception", ex);
		}

		finally {
			if (emplTrans != null) {
				emplTrans = null;
			}

			if (emplSession != null) {
				emplSession.clear();
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