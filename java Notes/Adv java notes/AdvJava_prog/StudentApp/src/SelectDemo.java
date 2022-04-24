import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class SelectDemo {
	public static void main(String[] args) throws Exception {
	   Class.forName("com.mysql.jdbc.Driver");	
	   Connection con = DriverManager.getConnection
			   ("jdbc:mysql://localhost/college","root","");
	   ResultSet rs =	
			   con.createStatement().executeQuery("select id from student");
	   while(rs.next()) {
	    System.out.println(rs.getInt(1));
	   }
	}
}
	
