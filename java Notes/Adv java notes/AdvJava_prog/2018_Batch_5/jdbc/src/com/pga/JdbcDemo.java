package com.pga;
import java.util.*;
//Purpose: TESTING the application (Unit testing)
public class JdbcDemo {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter ID  :");
	int r = sc.nextInt();
	System.out.println("Enter Name:");
	String n = sc.next();
	System.out.println("Enter Marks:");
	float m = sc.nextFloat();

	 	try {
		// StudentDao.addStudent(r, n, m);
		// StudentDao.deleteStudent(r);
		// StudentDao.updateMarks(r, m);
		List<Student> list = StudentDao.getAllStudents();
		System.out.println(list);
	}catch(Exception e) { e.printStackTrace();}
 }	
}








