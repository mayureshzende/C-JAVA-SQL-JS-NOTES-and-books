package com.pga;

import java.io.*;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/date")
public class DateServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {
		Date d = new Date();
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.write("<h2> Date is " + d +" </h2>");
	}
}




