package com.pga;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Demo {
 public static void main(String[] args) {
	 ApplicationContext ctx = new GenericXmlApplicationContext("beans.xml");
	 /*Emp e1 = (Emp) ctx.getBean("emp");
	 System.out.println(e1);
	 Emp e2 = (Emp) ctx.getBean("emp");
	 System.out.println(e2);
	 e2.salary = 40000;
	 System.out.println("e1: " + e1);//17,PGA,50000
	 System.out.println("e2: " + e2);//17,PGA,40000*/
 }
}
