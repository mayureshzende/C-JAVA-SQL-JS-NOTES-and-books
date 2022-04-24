package com.pga;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
 public static void main(String[] args) {
  AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(); 
  ctx.scan("com.pga");
  ctx.refresh();
  StudentDao dao = (StudentDao)ctx.getBean("studentDao");

  dao.addStudent(new Student(50, "SpringHibernate",81));
  dao.deleteStudent(1);
  dao.udpateMarks(3, 89);
  List<Student> list = dao.getAllStudents();
  System.out.println(list);
  Student s = dao.getStudent(1);
  System.out.println(s);
 }
}








