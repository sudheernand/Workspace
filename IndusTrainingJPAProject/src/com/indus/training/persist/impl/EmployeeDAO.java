package com.indus.training.persist.impl;

import javax.persistence.EntityManager;

import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.indus.training.persist.entity.Employee;
import com.indus.training.persist.exception.PersistanceException;
import com.indus.training.persist.service.IEmployeeDAO;

public class EmployeeDAO implements IEmployeeDAO {

	@Override
	public Employee select(Integer id) throws PersistanceException {

		Employee empObj = null;
		EntityManager myDbEntityMgrObj = Persistence.createEntityManagerFactory("IndusTrainingJPAProject")
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

	@Override
	public Boolean create(Employee empDetailsObj) throws PersistanceException {
		boolean result = false;
		EntityManager myDbEntityMgrObj = Persistence.createEntityManagerFactory("IndusTrainingJPAProject")
				.createEntityManager();

		EntityTransaction entTransObj = myDbEntityMgrObj.getTransaction();
		try {
			entTransObj.begin();
			myDbEntityMgrObj.persist(empDetailsObj);
			entTransObj.commit();
			result = true;
		} catch (Exception jpaex) {
			entTransObj.rollback();
			throw new PersistanceException("jpa exception", jpaex);
		} finally {
			if (myDbEntityMgrObj != null)
				myDbEntityMgrObj.clear();

		}

		return result;
	}

	@Override
	public Boolean update(Employee empDetailsObj) throws PersistanceException {
		boolean result = false;
		EntityManager myDbEntityMgrObj = Persistence.createEntityManagerFactory("IndusTrainingJPAProject")
				.createEntityManager();
		EntityTransaction entTransObj = myDbEntityMgrObj.getTransaction();
		try {
			entTransObj.begin();
			myDbEntityMgrObj.merge(empDetailsObj);
			entTransObj.commit();
			result = true;
		} catch (Exception jpaex) {
			result = false;
			jpaex.printStackTrace();
			throw new PersistanceException("jpa exception", jpaex);

		} finally {
			if (myDbEntityMgrObj != null)
				myDbEntityMgrObj.clear();

		}
		return result;
	}

	@Override
	public Boolean delete(Integer id) throws PersistanceException {
		return null;
	}

}
