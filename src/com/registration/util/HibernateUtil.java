package com.registration.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {
	private static SessionFactory sf;
	public static SessionFactory getSessionFactory() {
		if(sf == null) {
			return new AnnotationConfiguration().configure().buildSessionFactory();
		}
		return sf;
	}
}
