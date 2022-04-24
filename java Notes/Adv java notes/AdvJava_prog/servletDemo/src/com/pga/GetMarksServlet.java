package com.pga;
import java.sql.*;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class GetMarksServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request,
						HttpServletResponse response) 
						throws ServletException, IOException {
		int r = Integer.parseInt(request.getParameter("rollNo"));
		float output = 0;

		try {
		 Class.forName("com.mysql.jdbc.Driver");
		 Connection con = DriverManager.getConnection
				 ("jdbc:mysql://localhost/college","root","");
		 ResultSet rs = con.createStatement().
				 executeQuery("select marks from student where id="+r);
		 if(rs.next()) {
			 output = rs.getFloat(1);
		 }
		}catch(Exception e) {}
		PrintWriter out = response.getWriter();
		out.write("<h1>Marks of student with ID " + r +" is:" + output+"</h1>");
	}
  	}


