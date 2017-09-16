package com.indus.training.persist.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.indus.training.persist.entity.Employee;

public class EmployeeDao {
	

	public List<Employee> readUsingNamedQuery(Integer lmt, Integer offset) {

		List<Employee> empListObj = null;
		EntityManager myDbEntityMgrObj = Persistence.createEntityManagerFactory("IndusTrainingHibernateJpaServlet")
				.createEntityManager();

		EntityTransaction entTransObj = myDbEntityMgrObj.getTransaction();

		entTransObj.begin();
		javax.persistence.Query empQuery = myDbEntityMgrObj.createNamedQuery("findEbyM");

		try {
			empQuery.setParameter("x", lmt);
			empQuery.setParameter("y", offset);

			empListObj = (List<Employee>) empQuery.getResultList();

			entTransObj.commit();
		} catch (Exception jpaEx) {
			entTransObj.rollback();
		}

		return empListObj;

	}

}
