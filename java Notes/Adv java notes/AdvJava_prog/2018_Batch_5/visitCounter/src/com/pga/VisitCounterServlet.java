package com.pga;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet("/visitCount")
public class VisitCounterServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {
		ServletContext ctx = getServletContext();
		Integer count = (Integer)ctx.getAttribute("COUNT");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.write("<h2>VISIT count: " + count + "</h2>");
	}
}



