package com.indus.training.persist.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.indus.training.persist.entity.Employee;
import com.indus.training.persist.exception.PersistException;
import com.indus.training.persist.service.IEmployeeDAO;

public class EmployeeDAO implements IEmployeeDAO {

	public Employee select(Integer id) throws PersistException {

		Employee empObj = null;
		EntityManager myDbEntityMgrObj = Persistence.createEntityManagerFactory("IndusTrainingHibernateJpa")
				.createEntityManager();

		EntityTransaction entTransObj = myDbEntityMgrObj.getTransaction();

		entTransObj.begin();
		try {

			empObj = myDbEntityMgrObj.find(Employee.class, id);

			entTransObj.commit();
		} catch (Exception jpaEx) {
			entTransObj.rollback();
		}

		return empObj;
	}

	public boolean create(Employee empDetailsObj) throws PersistException {

		boolean result = false;
		EntityManager myDbEntityMgrObj = Persistence.createEntityManagerFactory("IndusTrainingHibernateJpa")
				.createEntityManager();

		EntityTransaction entTransObj = myDbEntityMgrObj.getTransaction();
		try {
			entTransObj.begin();
			myDbEntityMgrObj.persist(empDetailsObj);
			entTransObj.commit();
			result = true;
		} catch (Exception jpaex) {
			entTransObj.rollback();

		} finally {
			if (myDbEntityMgrObj != null)
				myDbEntityMgrObj.clear();

		}

		return result;
	}

	public boolean update(Employee empDetailsObj) throws PersistException {
		return false;
	}

}