package com.pga;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/context")
public class ContextReadServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext ctx = getServletContext();
		String port = ctx.getInitParameter("PORT");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<h2>PORT => " + port+"</h2>");
	}

}
