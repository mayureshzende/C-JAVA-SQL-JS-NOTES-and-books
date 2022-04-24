package com.pga;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Demo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
//		Student s = new Student(111,"Hibernate",91);
//		session.save(s); // Insert query
		
		Student s  = session.get(com.pga.Student.class, 8); // SELECT query
		s.setsMarks(70);
		session.update(s);

		
		System.out.println("update done...");
		t.commit();
		
		sf.close();
	}
}











