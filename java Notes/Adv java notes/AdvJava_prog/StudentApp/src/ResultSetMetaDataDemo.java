//Retrieve list of tables from database using JDBC
import java.sql.*;

public class ResultSetMetaDataDemo {
	public static void main(String[] args) throws Exception {
	 Class.forName("com.mysql.jdbc.Driver");
	 Connection con = DriverManager.
			 getConnection("jdbc:mysql://localhost/college","root","");
	 DatabaseMetaData dbmd = con.getMetaData();
	 System.out.println(dbmd.getDatabaseProductName());
	 System.out.println(dbmd.getDatabaseProductVersion());
	 ResultSet rs = dbmd.getTables(null,null,null,null);
	 
	 ResultSetMetaData rsmd = rs.getMetaData();
	 System.out.println("Column count " + rsmd.getColumnCount());
	 for(int i=1 ; i<=rsmd.getColumnCount(); i++) {
		 System.out.println(rsmd.getColumnName(i));
		 //System.out.println("Type:" + rsmd.getColumnTypeName(i));
	 }
	 while(rs.next()) {
		 String tableName = rs.getString(3);//3 or TABLE_NAME
		 System.out.println(tableName);
	 }

	 ResultSet rs1= dbmd.getPrimaryKeys(null, null, "emp");
	 if(rs1.next()) {
		 System.out.println("primary key is : " + rs1.getString(4));
	 }
	}
}








