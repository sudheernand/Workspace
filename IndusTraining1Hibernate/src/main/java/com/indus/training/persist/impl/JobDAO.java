package com.indus.training.persist.impl;

import javax.persistence.PersistenceException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.indus.training.persist.entity.Job;
import com.indus.training.persist.service.IJob;
import com.indus.training.utils.HibernateUtil;

public class JobDAO implements IJob {

	public Job select(Integer id) throws PersistenceException {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();

		Job details = null;

		try {
			details = (Job) session.get(Job.class, id);

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

	public boolean create(Job jobObj) throws PersistenceException {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();


		try {
			session.save(jobObj);

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
