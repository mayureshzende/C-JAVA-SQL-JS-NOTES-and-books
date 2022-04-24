import java.sql.*;
import java.util.Scanner;
public class Update_Dynamic {
public static void main(String[] args)throws Exception {
	Scanner sc=new Scanner(System.in);
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "mayur","777");
	System.out.println("done connected");
	
	String sql="update student set marks=? where id=?";
	
	PreparedStatement ps=con.prepareStatement(sql);
	System.out.println("enter the roll no to update:");
	int r=sc.nextInt();
	System.out.println("enter the marks to be udated");
	float f=sc.nextFloat();
	
	ps.setInt(2, r);
	ps.setFloat(1, f);
	ps.executeUpdate();
	
	System.out.println("updated");
	
	
	ps.close();
con.close();	
}
}
