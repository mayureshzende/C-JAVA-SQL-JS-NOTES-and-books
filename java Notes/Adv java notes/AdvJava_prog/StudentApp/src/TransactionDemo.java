import java.sql.*;

public class TransactionDemo {
 public static void main(String[] args) throws Exception {
	   Class.forName("com.mysql.jdbc.Driver");	
	   Connection con = DriverManager.getConnection
			   ("jdbc:mysql://localhost/college","root","");
	   con.setAutoCommit(false);//by default commit is ON
	   try {
	   con.createStatement().executeUpdate
	   ("delete from student where id=2");
	   System.out.println("waiting for 15 seconds...");
	   Thread.sleep(15000);
	   ResultSet rs =	
			   con.createStatement().executeQuery("select id from student");
	   while(rs.next()) {
	    System.out.println(rs.getInt(1));
	   }
	   con.createStatement().executeUpdate
	   	("insert into student values(1,'abc',88)");
	   con.commit();//commiting manually
	   }catch(SQLException e) { System.out.println("Operation failed..");}
 	}
}
