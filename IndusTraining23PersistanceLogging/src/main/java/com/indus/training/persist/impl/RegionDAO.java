package com.indus.training.persist.impl;

import javax.persistence.PersistenceException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.indus.training.persist.entity.Location;
import com.indus.training.persist.entity.Region;
import com.indus.training.persist.service.IRegion;
import com.indus.training.utils.HibernateUtil;

public class RegionDAO implements IRegion{

	public Region select(Integer id) throws PersistenceException {SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	Session session = sessionFactory.openSession();

	Transaction transaction = session.beginTransaction();

	Region details = null;

	try {
		details = (Region) session.get(Region.class, id);

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

	public boolean create(Region regObj) throws PersistenceException {SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	Session session = sessionFactory.openSession();

	Transaction transaction = session.beginTransaction();


	try {
		session.save(regObj);

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
		// TODO Auto-generated method stub
		return false;
	}

}
