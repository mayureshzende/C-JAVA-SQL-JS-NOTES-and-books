import java.sql.*;
public class Insert_Jdbc {
	public static void main(String[] args) {
		

	Statement st=null;
	Connection con=null;
	
	try
	{
//		Class.forName("oracle.jdbc.driver.OracleDriver");  
//		String url="jdbc:oracle:thin:@localhost:1521:xe";
//		
//		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		con=DriverManager.getConnection(url, "mayur","777");
	System.out.println("connection done");
	
	st=con.createStatement();
	String sql="insert into student(id,name,marks) values (3,'mayur',78)";
	st.executeQuery(sql);
	st.close();
	con.close();
	System.out.println("inserted sucessfully");
	
	}catch(Exception e){
		e.printStackTrace();
		System.exit(0);
	}
 }
}
