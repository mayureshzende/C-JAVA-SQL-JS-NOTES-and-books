package com.pga;
import java.sql.*;
import java.util.*;

import org.springframework.jdbc.core.*;

//CRUD operation for student table
public class StudentDao {
 private JdbcTemplate template;
 
 public void setTemplate(JdbcTemplate template) {
	 this.template = template;
 }
 
 void addStudent(int rollNo, String name, float marks) {
	 String sql = "insert into student values(?,?,?)";
	 this.template.update(sql, new Object[] {rollNo, name, marks});
	 System.out.println("Student inserted");
 } 
 void deleteStudent(int rollNo) {
	 String sql = "delete from student where rollNo=?";
	 this.template.update(sql, new Object[] {rollNo});
	 System.out.println("Student deleted");

 } 
 void updateMarks(int rollNo, float marks) {
	 String sql = "update student set marks=? where rollNo=?";
	 this.template.update(sql, new Object[] {marks, rollNo});
	 System.out.println("Student Updated");
 }
 
 List<Student> getAllStudent() {
	 String sql = "select * from student";
	 // return template.query(sql, new StudentRowMapper());
	 return template.query(sql, new RowMapper<Student>() {
		public Student mapRow(ResultSet rs, int arg1) throws SQLException {
			return new Student(rs.getInt(1), rs.getString(2), rs.getFloat(3));
		}
	 });
 }
 class StudentRowMapper implements RowMapper<Student> {
		public Student mapRow(ResultSet rs, int arg1) throws SQLException {
			return new Student(rs.getInt(1), rs.getString(2), rs.getFloat(3));
		}
 }
}

















