import java.sql.*;
import java.util.*;
public class StudentDao {

	public static void AddStudent(int r,String name,float marks)throws Exception
	{
	 Connection con=Dbutil.getconnection();
	 String sql="insert into student (id,name,marks) values (?,?,?)";
	 PreparedStatement ps=con.prepareStatement(sql);
	 ps.setInt(1, r);
	 ps.setString(2,name);
	 ps.setFloat(3, marks);
	 ps.executeUpdate();
	 System.out.println("insert sucessfull");
	 }
	
	public static void UpdateStudent(int r,float m)throws Exception
	{
		Connection con=Dbutil.getconnection();
		String sql="update student set marks=? where id=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(2, r);
		ps.setFloat(1,m);
		ps.executeUpdate();
		System.out.println("update sucessfull");
	}

	public static void DeleteStudent(int r)throws Exception
	{
		Connection con=Dbutil.getconnection();
		String sql="delete from student where id=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1,r);
		ps.executeUpdate();
		System.out.println("deleted");
	}
	
	public static List<Student> getAllStudent()throws Exception
	{
		Connection con=Dbutil.getconnection();
		String sql="select * from student order by id";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		List<Student> list=new ArrayList<Student>();
		while(rs.next()) 
		{
		int r=rs.getInt(1);
		String name=rs.getString(2);
		float m=rs.getFloat(3);
		Student S1=new Student(r,name,m);
		list.add(S1);
		}
		return list;
	}

}

