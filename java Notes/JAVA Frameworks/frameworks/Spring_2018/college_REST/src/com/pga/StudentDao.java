package com.pga;

import java.util.List;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

public class StudentDao {
  private HibernateTemplate template;

  public void setTemplate(HibernateTemplate template) {
	  this.template = template;
  }
  public HibernateTemplate getTemplate() {
	return template;
  }
  @Transactional
  public void addStudent(Student s) {
	  this.template.save(s);
	  System.out.println("Save is successful...");
  }
  @Transactional
  public void deleteStudent(int id) {
	  Student s = this.template.get(Student.class, id);
	  this.template.delete(s);
	  System.out.println("Delete done..");
  }
  @Transactional
  public void udpateMarks(int id, float marks) {
	  Student s = this.template.get(Student.class, id);
	  s.setMarks(marks);
	  this.template.update(s);
	  System.out.println("Update is done...");
  }
  Student getStudent(int id) {
	  return this.template.get(Student.class, id);
  }
  List<Student> getAllStudents() {
		return this.template.loadAll(Student.class);
  }
}






