package com.indus.training.persist.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.indus.training.persist.entity.Employee;
import com.indus.training.persist.exception.PersistException;
import com.indus.training.persist.service.IEmployeeDAO;
import com.indus.training.utils.HibernateUtil;

public class EmployeeDAO {
	public List<Employee> select(Integer manId, Integer emId) throws PersistException {

		List<Employee> empObj = null;
		EntityManager myDbEntityMgrObj = Persistence
				.createEntityManagerFactory("Indus5trainingHibernateQuerypJpaNamedQuery4").createEntityManager();

		EntityTransaction entTransObj = myDbEntityMgrObj.getTransaction();

		entTransObj.begin();
		javax.persistence.Query empQuery = myDbEntityMgrObj.createNamedQuery("findEbyM");

		try {
			empQuery.setParameter("x", manId);
			empQuery.setParameter("y", emId);

			empObj = (List<Employee>) empQuery.getResultList();

			entTransObj.commit();
		} catch (Exception jpaEx) {
			entTransObj.rollback();
		}

		return empObj;
	}

}
