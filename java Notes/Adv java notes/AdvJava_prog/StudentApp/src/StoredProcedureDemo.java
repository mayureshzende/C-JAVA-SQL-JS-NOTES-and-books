//How to call stored procedures using JDBC (Java)
import java.sql.*;

public class StoredProcedureDemo {
 public static void main(String[] args) throws Exception {
   Class.forName("com.mysql.jdbc.Driver");	
   Connection con = DriverManager.getConnection
		   ("jdbc:mysql://localhost/college","root","");
   CallableStatement cs = con.prepareCall("call getMarks(?,?)");
   int id = 2;
   cs.setInt(1, id);
   cs.registerOutParameter(2, Types.FLOAT);
   cs.executeUpdate();
   float marks = cs.getFloat(2);
   System.out.println(marks);
   
   CallableStatement cs1 = con.prepareCall("call getStudentCount(?)");
   cs1.registerOutParameter(1, Types.INTEGER);
   cs1.executeUpdate();
   int total = cs1.getInt(1);
   System.out.println("Total no. of students: " + total);
 }
}









