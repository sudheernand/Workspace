package com.indus.training.persist.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.indus.training.persist.entity.Country;
import com.indus.training.persist.exception.PersistException;
import com.indus.training.persist.service.ICountryDAO;

public class CountryDAO implements ICountryDAO {

	public Country select(String id) throws PersistException {

		Country conObj = null;
		EntityManager myDbEntityMgrObj = Persistence
				.createEntityManagerFactory("IndusTrainingHibernateCollectionsXmlMapping3jpa").createEntityManager();

		EntityTransaction entTransObj = myDbEntityMgrObj.getTransaction();

		entTransObj.begin();
		try {

			conObj = myDbEntityMgrObj.find(Country.class, id);

			entTransObj.commit();
		} catch (Exception jpaEx) {
			entTransObj.rollback();
		}

		return conObj;

	}

	public boolean create(Country empDetailsObj) throws PersistException {
		return false;
	}

	public boolean update(Country empDetailsObj) throws PersistException {
		return false;
	}

}
