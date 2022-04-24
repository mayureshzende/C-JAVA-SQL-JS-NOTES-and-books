package com.pga;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
 public static void main(String[] args) {
	 ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
	 
	 StudentCRUD obj = (StudentCRUD)ctx.getBean("studentCrud");
	 obj.addStudent();
	 obj.deleteStudent();
	 obj.updateStudent();
 }
}
