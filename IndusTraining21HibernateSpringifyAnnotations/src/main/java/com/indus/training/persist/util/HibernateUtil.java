package com.indus.training.persist.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@org.springframework.context.annotation.Configuration
@Component
public class HibernateUtil {

	// private static final SessionFactory sessionFactory =
	// buildSessionFactory();
	public HibernateUtil() {
		super();
	}

	@Bean
	@Scope("prototype")
	public SessionFactory buildSessionFactory() {
		try {
			// Create the SessionFactory from hibernate.cfg.xml
			return new Configuration().configure().buildSessionFactory();
			// Configuration config = new Configuration();
			//
			// config.configure("hibernate.cfg.xml");
			// SessionFactory sf = config.buildSessionFactory();

			// return sf;
		} catch (Throwable ex) {
			// Make sure you log the exception, as it might be swallowed
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	// public static SessionFactory getSessionFactory() {
	// return sessionFactory;
	// }

}