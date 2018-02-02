package com.tc25.HButil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HBUtils {
	
	private static Session session = null; 
	private static SessionFactory ssf = null;
	static {
		Configuration cfg = new Configuration().configure();
		ServiceRegistry serviceRegistry = 
				new StandardServiceRegistryBuilder()
				.applySettings(cfg.getProperties())
				.build();
		ssf = cfg.buildSessionFactory(serviceRegistry);
	}
	
	public static Session getSession() {
		if(session == null || !session.isOpen()) {
			session = ssf.openSession();
		}
		return session;
	}

}
