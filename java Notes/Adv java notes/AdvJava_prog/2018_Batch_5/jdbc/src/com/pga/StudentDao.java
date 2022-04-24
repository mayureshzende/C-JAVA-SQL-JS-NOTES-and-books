package com.pga;
import java.util.*;
import java.sql.*;
//Dao: Data Access Object
// Provide CRUD operation for "student" table
public class StudentDao {
  public static void addStudent(int id, String n, float m)
		  throws SQLException {
	  Connection con = DbUtils.getDbConnection();
	  String sql = "insert into student values(?,?,?)";
	  PreparedStatement ps = con.prepareStatement(sql);
	  ps.setInt(1, id);
	  ps.setString(2, n);
	  ps.setFloat(3, m);
	  ps.executeUpdate();
  }
  public static void deleteStudent(int id) throws SQLException {
	  Connection con = DbUtils.getDbConnection();
	  String sql = "delete from student where rollNo=?";
	  PreparedStatement ps = con.prepareStatement(sql);
	  ps.setInt(1, id);
	  ps.executeUpdate();
  }
  public static void updateMarks(int id, float m) throws SQLException {
	  Connection con = DbUtils.getDbConnection();
	  String sql = "update student set marks=? where rollNo=?";
	  PreparedStatement ps = con.prepareStatement(sql);
	  ps.setFloat(1, m);
	  ps.setInt(2, id);
	  ps.executeUpdate();
  }
  public static List<Student> getAllStudents() throws SQLException {
	  Connection con = DbUtils.getDbConnection();
	  String sql = "select * from student";
	  Statement st = con.createStatement();
	  ResultSet rs = st.executeQuery(sql);
	  List<Student> list = new ArrayList<Student>();
	  while(rs.next()) {
		int id =  rs.getInt(1);// OR rs.getInt("rollNo")
		String n =  rs.getString(2);// OR rs.getString("name")
		float m =  rs.getFloat(3);// OR rs.getFloat("marks");
		Student s = new Student(id,n,m);
		list.add(s);
	  }
	  return list;
  }
}








