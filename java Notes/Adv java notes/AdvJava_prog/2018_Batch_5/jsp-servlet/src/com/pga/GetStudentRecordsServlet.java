package com.pga;

import java.io.IOException;
import java.sql.*;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/get/students")
public class GetStudentRecordsServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {
	 String op = request.getParameter("op");
	 String sql = "select * from student where marks ";
	 switch(op) {
	 case "DIST": 
		 sql = sql + " >= 75"; 
		 break;
	 case "FIRST": 
		 sql = sql + "between 60 and 75"; 
		 break;
	 case "FAIL": 
		 sql = sql + " < 35"; 
		 break;
	 }
	 try {
		 Class.forName("com.mysql.jdbc.Driver");
		 String url = "jdbc:mysql://localhost/pga";
		 Connection con =
			DriverManager.getConnection(url,"root","");
		 ResultSet rs = con.createStatement().executeQuery(sql);
		 List<Student> list = new ArrayList<Student>();
		 while(rs.next()) {
		  Student s =
			new Student(rs.getInt(1),rs.getString(2),rs.getFloat(3));
		  list.add(s);
		 }
		 
		 HttpSession session = request.getSession();
		 session.setAttribute("STUD_LIST", list);
		 RequestDispatcher rd = request.getRequestDispatcher("../list.jsp");
		 rd.forward(request, response);
	 }catch(Exception e) { e.printStackTrace();}
	}
}


















