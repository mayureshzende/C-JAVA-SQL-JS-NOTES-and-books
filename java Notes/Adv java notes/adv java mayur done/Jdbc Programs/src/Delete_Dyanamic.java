import java.sql.*;
import java.util.Scanner;

public class Delete_Dyanamic {
     public static void main(String[] args) throws Exception
     {
	    Scanner sc=new Scanner(System.in);
         Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mayur", "777");
	    System.out.println("connection done");
	    
	    //Statement st=con.createStatement();
	    
	    String sql="delete from student where id=?";
	    
	    System.out.println("neter the roll no to be deleted");
	    int r=sc.nextInt();
	    
	    PreparedStatement ps=con.prepareStatement(sql);
	    ps.setInt(1,r);
	    
	    ps.executeUpdate();
	    System.out.println("deleted");
	    ps.close();
	    con.close();
	    
	    
	    
	    
	     }

}
