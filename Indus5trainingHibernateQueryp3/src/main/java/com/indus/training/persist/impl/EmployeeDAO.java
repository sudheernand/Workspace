package com.indus.training.persist.impl;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.indus.training.persist.entity.Employee;
import com.indus.training.persist.exception.PersistException;
import com.indus.training.persist.service.IEmployeeDAO;
import com.indus.training.utils.HibernateUtil;

public class EmployeeDAO {
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

	public List<Employee> readUsingHQl(Integer eId, Integer mId) throws PersistException {
		List<Employee> readResult = null;

		if (eId == null) {
			throw new PersistException("eID: read: employee id can't be null.");
		}

		Session readSession = HibernateUtil.getSessionFactory().openSession();
		Transaction readTrans = readSession.beginTransaction();
		Query empHqlQuery = readSession.createQuery("from Employee where managerId > :mIdp and employeeId > :eIdp");

		try {
			empHqlQuery.setParameter("eIdp", eId);
			empHqlQuery.setParameter("mIdp", mId);
			readResult = (List<Employee>) empHqlQuery.list();
			readTrans.commit();
		} catch (Exception sqlEx) {
			readTrans.rollback();
		} finally {
			readSession.clear();
		}

		return readResult;
	}

	public List<Employee> readUsingCriteria(Integer empId, Integer manId) throws PersistException {
		List<Employee> readResult = null;

		if (empId == null) {
			throw new PersistException("eID: read: employee id can't be null.");
		}

		Session readSession = HibernateUtil.getSessionFactory().openSession();
		Transaction readTrans = readSession.beginTransaction();
		Criteria empCriteriaObj = readSession.createCriteria(Employee.class);

		try {

			empCriteriaObj
					.add(Restrictions.and(Restrictions.gt("employeeId", empId), Restrictions.gt("managerId", manId)));
			readResult = (List<Employee>) empCriteriaObj.list();
			readTrans.commit();
		} catch (Exception sqlEx) {
			readTrans.rollback();
		} finally {
			readSession.clear();
		}

		return readResult;

	}

	public List<Employee> readUsingNativeSQL(Integer eId, Integer sal) throws PersistException {
		List<Employee> readResult = null;
		if (eId == null) {
			throw new PersistException("eID: read: employee id can't be null.");
		}

		Session readSession = HibernateUtil.getSessionFactory().openSession();
		Transaction readTrans = readSession.beginTransaction();
		SQLQuery empSQLQuery = readSession
				.createSQLQuery("SELECT * FROM EMPLOYEES WHERE SALARY > :salp and EMPLOYEE_ID>:eIdp");

		empSQLQuery.addEntity(Employee.class);
		empSQLQuery.setParameter("salp", sal);
		empSQLQuery.setParameter("eIdp", eId);

		try {
			readResult = (List<Employee>) empSQLQuery.list();
			readTrans.commit();
		} catch (Exception sqlEx) {
			readTrans.rollback();
		} finally {
			readSession.clear();
		}

		return readResult;
	}

	public List<Employee> readUsingNamedQuery(Integer eId, Integer sal) throws PersistException {
		List<Employee> readResult = null;

		if (eId == null) {
			throw new PersistException("eID: read: employee id can't be null.");
		}

		Session readSession = HibernateUtil.getSessionFactory().openSession();
		Transaction readTrans = readSession.beginTransaction();

		Query empSQLQuery = readSession.getNamedQuery("findEmpSql");

		empSQLQuery.setParameter("eIdp", eId);
		empSQLQuery.setParameter("salp", sal);

		try {
			readResult = (List<Employee>) empSQLQuery.list();
			readTrans.commit();
		} catch (Exception sqlEx) {
			readTrans.rollback();
		} finally {
			readSession.clear();
		}

		return readResult;

	}

}
