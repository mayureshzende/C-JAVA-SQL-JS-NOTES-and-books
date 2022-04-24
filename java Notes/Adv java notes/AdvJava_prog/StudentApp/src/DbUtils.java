//Common class for getting DB Connection object
import java.sql.*;
public class DbUtils {
	private static Connection con = null;
	private static String url = "jdbc:mysql://localhost/college";
	
	public static Connection getConnection() 
				throws SQLException, ClassNotFoundException {
		if(con == null) {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,"root","");
		}
		return con;
	}

	public static void close() throws SQLException{
		con.close();
	}
}





