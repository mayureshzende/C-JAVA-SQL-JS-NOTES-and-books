import java.sql.*;
public class Delete_Startic {
public static void main(String[] args) {
	Connection con=null;
	Statement st=null;
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "mayur","777");
		
		st=con.createStatement();
		
		String sql="delete from student where id=4";
		st.executeUpdate(sql);
		
		System.out.println("deleted"); 
		
		st.close();
		
		
		
		
		
	}catch(Exception e ) {
		e.printStackTrace();
	}
}
}
