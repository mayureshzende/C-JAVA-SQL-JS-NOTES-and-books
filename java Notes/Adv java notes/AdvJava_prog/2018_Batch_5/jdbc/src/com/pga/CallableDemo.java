package com.pga;
import java.sql.*;
public class CallableDemo {
	public static void main(String[] args) throws Exception {
		Connection con = DbUtils.getDbConnection();
		CallableStatement cs =
				con.prepareCall("call getStudentMarks(?,?)");
		cs.setInt(1, 6);//rollNo=6
		cs.registerOutParameter(2, Types.FLOAT);
		cs.executeUpdate();
		float m= cs.getFloat(2);
		System.out.println("Marks of rollNo=6 is " + m);
		
		CallableStatement cs1 =
				con.prepareCall("call getStudentCount(?)");
		cs1.registerOutParameter(1, Types.INTEGER);
		cs1.executeUpdate();
		int cnt = cs1.getInt(1);
		System.out.println("Total count is " + cnt);

	}
}
