package com.pga;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class MultiplicationTableServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) 
					throws ServletException, IOException {
		int n = Integer.parseInt(request.getParameter("num"));
		PrintWriter out = response.getWriter();
		out.write("<HTML><Table border='1'>");
		for(int i=1; i<=10; i++) {
		 out.write("<TR><TD>" + (n*i) +"</TD></TR>");
		}
		out.write("</Table></HTML>");
	}
}






