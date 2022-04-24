package electronics;
import java.sql.*;
public class Demo {
public static void main(String[] args) {
Connection con=null;
Statement st=null;

	
try {
	Class.forName("oracle.jdbc.driver.OracleDriver");  
	String url="jdbc:oracle:thin:@localhost:1521:xe";
    con=DriverManager.getConnection(url,"mayur","777");  
    System.out.println("connection done");

	con.close();
	
	
	
	
}catch(Exception e) {
	e.printStackTrace();
	System.out.println("class not found");
}



}
}