//CRUD operations for student table
import java.sql.*;
import java.util.*;

public class StudentDao {
	static void addStudent(int r, String n, float m) throws Exception {
		Connection con = DbUtils.getConnection();
		String sql = "insert into student values(?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, r);
		ps.setString(2, n);
		ps.setFloat(3, m);
		ps.executeUpdate();
		System.out.println("Insert is successful");
	} 
	static void deleteStudent(int r) throws Exception {
		Connection con = DbUtils.getConnection();
		String sql = "delete from student where id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, r);
		ps.executeUpdate();
		System.out.println("Delete is successful");
	}
	
	static void updateStudentMarks(int r, float m) throws Exception {
		Connection con = DbUtils.getConnection();
		String sql = "update student set marks=? where id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setFloat(1, m);
		ps.setInt(2, r);
		ps.executeUpdate();
		System.out.println("Update is successful");
	}
	static List<Student> getAllStudents() throws Exception {
		Connection con = DbUtils.getConnection();
		String sql = "select * from student";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		List<Student> list = new ArrayList<Student>();
		while(rs.next()) {
			int r = rs.getInt("id");//1 or id
			String n = rs.getString("name");//2 or name
			float m = rs.getFloat(3);//3 or "marks"
			Student s = new Student(r,n,m);
			list.add(s);
		}
		return list;
	}
}
	
















