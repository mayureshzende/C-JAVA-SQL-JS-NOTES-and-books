package com.pga;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import java.util.List;
public class Demo {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("beans.xml");
		StudentDao dao = (StudentDao)ctx.getBean("studentDao");
		// dao.addStudent(17, "Spring", 77);
		// dao.deleteStudent(999)
		// dao.updateMarks(1, 80);
		List<Student> list = dao.getAllStudent();
		System.out.println(list);
	}	
}
