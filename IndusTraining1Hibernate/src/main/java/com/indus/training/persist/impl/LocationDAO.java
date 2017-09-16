package com.indus.training.persist.impl;

import javax.persistence.PersistenceException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.indus.training.persist.entity.Location;
import com.indus.training.persist.service.ILocation;
import com.indus.training.utils.HibernateUtil;

public class LocationDAO implements ILocation {

	public Location select(Integer id) throws PersistenceException {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();

		Location details = null;

		try {
			details = (Location) session.get(Location.class, id);

			transaction.commit();
			System.out.println(details.toString());

		} catch (Exception ex) {
			transaction.rollback();
			throw new PersistenceException("persist exception");
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

	public boolean create(Location locObj) throws PersistenceException {
		if (locObj == null){
			throw new PersistenceException("persist exception");
		}
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();


		try {
			 session.save(locObj);

			transaction.commit();

		} catch (Exception ex) {
			transaction.rollback();
			throw new PersistenceException("persist exception");
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

	public boolean update(Integer id) throws PersistenceException {
		return false;
	}

}
