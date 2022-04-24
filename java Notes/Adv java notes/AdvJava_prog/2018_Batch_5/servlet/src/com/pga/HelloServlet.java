package com.pga;

import java.io.*;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request,
						HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.write("<h1>Welcome to Servlet World !!!</h1>");
	}

	protected void doPost(HttpServletRequest request,
						 HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
