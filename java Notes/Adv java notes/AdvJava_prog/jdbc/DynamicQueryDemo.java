import java.sql.*;
import java.util.Scanner;
public class DynamicQueryDemo {
	public static void main(String[] args) throws Exception {
	 Scanner sc = new Scanner(System.in);
	 Class.forName("com.mysql.jdbc.Driver");
	 String url = "jdbc:mysql://localhost/college";
	 Connection con = DriverManager.getConnection(url,"root","");
//	 String sql = "insert into student values(?,?,?)";
//	 String sql = "delete from student where id=?";
	 String sql = "update student set marks=? where id=?";
	 
	 System.out.println("Enter roll No:");
	 int r = sc.nextInt();
//	 System.out.println("Enter Name:");
//	 String n = sc.next();
	 System.out.println("Enter Marks:");
	 float m = sc.nextFloat();

	 PreparedStatement ps = con.prepareStatement(sql);
	 ps.setFloat(1, m);
	 ps.setInt(2, r);
//	 ps.setInt(1, r);
//	 ps.setString(2, n);
//	 ps.setFloat(3, m);
	 ps.executeUpdate();
	 System.out.println("Record Updated...");
	 ps.close();
	 con.close();
	}
}








