import java.util.Scanner;
import java.sql.*;
public class LibDao {

	
	static void AddBook(String n,String a,float p,int id) throws Exception
	{
		Connection con=DbUtil.getConnecton();
		String sql="insert into lib_dt(name,author,price,id) values(?,?,?,?) ";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, n);
		ps.setString(2,a);
		ps.setFloat(3,p);
		ps.setInt(4,id);
		ps.executeUpdate();
		
		System.out.println("inserted");
		
	}
	
	static void DeLBook(String n,int id)throws Exception
	
	{
		Connection con=DbUtil.getConnecton();
		String sql="delete from lib_dt where name=? or id=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, n);
		ps.setInt(2,id);
		ps.executeUpdate();
		System.out.println("Deleted");
		
	}
	
	static void SearchBk(String n,String a)throws Exception
	{
		Connection con=DbUtil.getConnecton();
		String sql="Select * from lib_dt where name=? or author=? ";
		PreparedStatement ps=con.prepareStatement(sql);
		
		ps.setString(2,a);
		ps.setString(1,n);
		
		//ps.executeUpdate();
	ResultSet rs=ps.executeQuery();
//	List<Lib_>
		if(rs.next()) {
			
			Ret_srch rts=new Ret_srch();
			rts.setVisible(true);
			String s=rs.getString("NAME");
			//String s2=rs.getString("AUTHOR");
			//int s3=rs.getInt(4);//id
		}else
		{
			Search_Nf snf=new Search_Nf();
			snf.setVisible(true);
		}
		
	}
	
}
