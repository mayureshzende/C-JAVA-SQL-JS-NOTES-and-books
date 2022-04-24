package com.pga;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("beans.xml"); 
		Student s1 = (Student)ctx.getBean("stud1");
		Student s2 = (Student)ctx.getBean("stud2");

		System.out.println(s1);
		System.out.println(s2);
		System.out.println("SPRING DEMO");		
		
//		Student s1 = new Student();
//		s1.setId(11);
//		s1.setName("Fred");
//		Student s2 = new Student(12,"PGA");
//		System.out.println(s1);
//		System.out.println(s2);
	}
}
