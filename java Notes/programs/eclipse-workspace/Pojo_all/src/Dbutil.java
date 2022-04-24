import java.sql.*;
public class Dbutil {
private static Connection con=null;
private static String url="jdbc:oracle:thin:@localhost:1521:xe";

public static Connection getconnection() throws SQLException,ClassNotFoundException{
	if(con==null) {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection(url,"mayur", "root");
		System.out.println("connection done");
	}
	return con;
}
public void close()throws SQLException
{
	con.close();
}

}
