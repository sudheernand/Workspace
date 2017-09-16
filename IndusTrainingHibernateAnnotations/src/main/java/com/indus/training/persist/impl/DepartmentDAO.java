package com.indus.training.persist.impl;

import javax.persistence.PersistenceException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.indus.training.persist.entity.Department;
import com.indus.training.persist.service.IDepartmentDAO;
import com.indus.training.utils.HibernateUtil;

public class DepartmentDAO implements IDepartmentDAO {

	public Department select(Integer id) throws PersistenceException {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();

		Department details = null;

		try {
			details = (Department) session.get(Department.class, id);

			transaction.commit();

		} catch (Exception ex) {
			transaction.rollback();
			throw new PersistenceException("persist excpetion");
		}

		finally {
			if (transaction != null) {
				transaction = null;
			}

			if (session != null) {
				session.clear();
			}
		}

		return null;
	}

	public boolean create(Department depObj) throws PersistenceException {
		boolean result = false;
		if (depObj == null) {
			throw new PersistenceException("department Obj cant be null");
		}
		if (depObj.getDepartmentName() == null) {
			throw new PersistenceException("department name  cant be null");
		}
		if (depObj.getManagerId() == null) {
			throw new PersistenceException("manager  cant be null");
		}
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();

		try {
			session.save(depObj);

			transaction.commit();
			result = true;

		} catch (Exception ex) {
			transaction.rollback();
			result = false;
			throw new PersistenceException("persist excpetion");
		}

		finally {
			if (transaction != null) {
				transaction = null;
			}

			if (session != null) {
				session.clear();
			}
		}

		return result;
	}

	public boolean update(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

}
