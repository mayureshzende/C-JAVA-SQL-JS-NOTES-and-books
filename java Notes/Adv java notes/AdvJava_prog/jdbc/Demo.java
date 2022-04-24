import java.sql.*;
public class Demo {
 public static void main(String[] args) {
  Connection con = null;
  Statement st = null;
  try {
   Class.forName("com.mysql.jdbc.Driver");
   String url = "jdbc:mysql://localhost/college";
   con = DriverManager.getConnection(url,"root","");
   System.out.println("Connection DONE");
   st = con.createStatement();
   String sql = 
   "insert into student values(4,'pga11',78)";
   st.executeUpdate(sql);
   st.close();
   con.close();
   System.out.println("inserted record...");
  }catch(ClassNotFoundException e) {
  	System.out.println("Class not loaded");
  	System.exit(0);
  }catch(SQLException e) {
  	System.out.println("SQL Exception ...");
  	e.printStackTrace();
  }
 }
}

