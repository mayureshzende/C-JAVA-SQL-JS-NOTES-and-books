package com.pga;

import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.query.Query;
import org.hibernate.*;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
public class Demo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.addOrder(Order.desc("esalary"));
		
		Employee highestPaid = (Employee) criteria.list().get(0);
		System.out.println("EMp with highest salary: " + highestPaid);
//		sf.close();
		
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Employee> criteriaQuery = builder.createQuery(Employee.class);
        Root<Employee> root = criteriaQuery.from(Employee.class);
        criteriaQuery.select(root);
        criteriaQuery.orderBy(builder.desc(root.get("esalary")));
        Query<Employee> query = session.createQuery(criteriaQuery);
        List<Employee> list = query.getResultList();
        System.out.println("highest paid: " + list.get(0));
        }
}





