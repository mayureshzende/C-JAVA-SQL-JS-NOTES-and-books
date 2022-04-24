package com.pga;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import java.util.*;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

public class SelectRecords {
 public static void main(String[] args) {
	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
	SessionFactory sf = cfg.buildSessionFactory();
	Session session = sf.openSession();
	
//	Query q = session.createQuery("from com.pga.Student");
//	List<Student> list = q.getResultList();
	
	Query q = session.createQuery("select count(*) from com.pga.Student");
	long cnt= (long)q.uniqueResult();

	sf.close();
 }
}
















