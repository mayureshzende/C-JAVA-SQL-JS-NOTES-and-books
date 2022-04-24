package com.pga;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Demo {
 public static void main(String[] args) {
  ApplicationContext ctx = new GenericXmlApplicationContext("beans.xml");
  StudentDao dao = (StudentDao)ctx.getBean("studentDao");
  dao.addStudent(new Student(22, "SpringHibernate",81));
  dao.deleteStudent(55);
  dao.udpateMarks(100, 89);
  List<Student> list = dao.getAllStudents();
  System.out.println(list);
  Student s = dao.getStudent(1);
  System.out.println(s);
 }
}








