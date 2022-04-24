import java.sql.*;
public class DbUtil {
private static Connection con=null;
private static String url="jdbc:oracle:thin:@localhost:1521:xe";

public static Connection getConnecton()throws SQLException,ClassNotFoundException
{
	if(con==null) {
		Class.forName("oracle.jdbc.driver.OracleDriver");	
		con=DriverManager.getConnection(url, "mayur","777");
	}
	return con;
}
public void close() throws SQLException{
	con.close();
}

}
