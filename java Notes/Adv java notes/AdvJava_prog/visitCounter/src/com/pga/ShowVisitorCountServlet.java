package com.pga;
import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/showCount")
public class ShowVisitorCountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
		HttpServletResponse response) throws ServletException, IOException {
	  PrintWriter out = response.getWriter();
	  ServletContext application = request.getServletContext();
	  int cnt = (Integer)application.getAttribute("COUNT");
	  out.write("<h1>Total count is " + cnt + "</h1>");
	}
}




