package com.indus.training.persist.impl;

import javax.persistence.PersistenceException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.indus.training.persist.entity.Country;
import com.indus.training.persist.service.ICountry;
import com.indus.training.utils.HibernateUtil;

public class CountryDAO implements ICountry {

	public Country select(Integer id) throws PersistenceException {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();

		Country details = null;

		try {
			details = (Country) session.get(Country.class, id);

			transaction.commit();
			System.out.println(details.toString());

		} catch (Exception ex) {
			transaction.rollback();
			throw new PersistenceException("persistance exception ", ex);
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

	public boolean create(Country conObj) throws PersistenceException {
		if (conObj == null) {
			throw new PersistenceException("Obj can be null");

		}
		if (conObj.getCountryId() == null) {
			throw new PersistenceException("CountryId can be null");

		}
		if (conObj.getCountryName() == null) {
			throw new PersistenceException("name can be null");

		}
		if (conObj.getRegionId() == null) {
			throw new PersistenceException("region can be null");

		}
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();

		try {
			session.save(conObj);

			transaction.commit();

		} catch (Exception ex) {
			transaction.rollback();
			throw new PersistenceException("persistance exception ", ex);
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

	public boolean update(Country conObj) throws PersistenceException {
		return false;
	}

}
