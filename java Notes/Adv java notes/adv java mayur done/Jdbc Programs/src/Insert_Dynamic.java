import java.sql.*;
import java.util.Scanner;
public class Insert_Dynamic {
public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mayur","777");
				
		String sql="insert into student(id,name,marks) values(?,?,?)";
		
		System.out.println("enter the  roll_no");
		int r=sc.nextInt();
		System.out.println("enter the name");
		String n=sc.next();
		System.out.println("enter the marks ");
		float m=sc.nextFloat();
		
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1,r);
		ps.setString(2,n);
		ps.setFloat(3,m);
	ps.executeUpdate();

	System.out.println("record inserted");
	
	ps.close();
	con.close();
}
}
