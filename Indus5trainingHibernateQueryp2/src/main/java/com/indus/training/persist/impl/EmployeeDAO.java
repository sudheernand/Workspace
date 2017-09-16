package com.indus.training.persist.impl;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.indus.training.persist.entity.Employee;
import com.indus.training.persist.exception.PersistException;
import com.indus.training.persist.service.IEmployeeDAO;
import com.indus.training.utils.HibernateUtil;

public class EmployeeDAO implements IEmployeeDAO {
	public Employee read(Integer eId) throws PersistException {
		Employee readResult = null;

		if (eId == null) {
			throw new PersistException("eID: read: employee id can't be null.");
		}

		Session readSession = HibernateUtil.getSessionFactory().openSession();
		Transaction readTrans = readSession.beginTransaction();

		try {
			readResult = (Employee) readSession.get(Employee.class, eId);
			readTrans.commit();
		} catch (Exception sqlEx) {
			readTrans.rollback();
		} finally {
			readSession.clear();
		}

		return readResult;

	}

	public Employee readUsingHQl(String eFName) throws PersistException {
		Employee readResult = null;

		if (eFName == null) {
			throw new PersistException("eID: read: employee id can't be null.");
		}

		Session readSession = HibernateUtil.getSessionFactory().openSession();
		Transaction readTrans = readSession.beginTransaction();
		Query empHqlQuery = readSession.createQuery("from Employee where firstName = :empFName ");

		try {
			empHqlQuery.setParameter("empFName", eFName);
			readResult = (Employee) empHqlQuery.uniqueResult();
			readTrans.commit();
		} catch (Exception sqlEx) {
			readTrans.rollback();
		} finally {
			readSession.clear();
		}

		return readResult;
	}

	public Employee readUsingCriteria(String empFName) throws PersistException {
		Employee readResult = null;

		if (empFName == null) {
			throw new PersistException("eID: read: employee id can't be null.");
		}

		Session readSession = HibernateUtil.getSessionFactory().openSession();
		Transaction readTrans = readSession.beginTransaction();
		SQLQuery empSQLQuery = readSession.createSQLQuery("SELECT * FROM EMPLOYEES WHERE FIRST_NAME = :first_name");

		empSQLQuery.addEntity(Employee.class);
		empSQLQuery.setParameter("first_name", empFName);

		try {
			readResult = (Employee) empSQLQuery.uniqueResult();
			readTrans.commit();
		} catch (Exception sqlEx) {
			readTrans.rollback();
		} finally {
			readSession.clear();
		}

		return readResult;

	}

	public Employee readUsingNativeSQL(String eFName) throws PersistException {
		Employee readResult = null;
		if (eFName == null) {
			throw new PersistException("eID: read: employee id can't be null.");
		}

		Session readSession = HibernateUtil.getSessionFactory().openSession();
		Transaction readTrans = readSession.beginTransaction();
		SQLQuery empSQLQuery = readSession.createSQLQuery("SELECT * FROM EMPLOYEES WHERE FIRST_NAME = :first_name");

		empSQLQuery.addEntity(Employee.class);
		empSQLQuery.setParameter("first_name", eFName);

		try {
			readResult = (Employee) empSQLQuery.uniqueResult();
			readTrans.commit();
		} catch (Exception sqlEx) {
			readTrans.rollback();
		} finally {
			readSession.clear();
		}

		return readResult;
	}

	public Employee readUsingNamedQuery(String eFName) throws PersistException {
		Employee readResult = null;

		if (eFName == null) {
			throw new PersistException("eID: read: employee id can't be null.");
		}

		Session readSession = HibernateUtil.getSessionFactory().openSession();
		Transaction readTrans = readSession.beginTransaction();

		Query empSQLQuery = readSession.getNamedQuery("findEmpSql");

		empSQLQuery.setParameter("first_name", eFName);

		try {
			readResult = (Employee) empSQLQuery.uniqueResult();
			readTrans.commit();
		} catch (Exception sqlEx) {
			readTrans.rollback();
		} finally {
			readSession.clear();
		}

		return readResult;

	}

}
