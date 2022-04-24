package com.pga;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet(
		urlPatterns = { "/student" }, 
		initParams = { 
			@WebInitParam(name = "TABLE", value = "student")
		})
public class StudentDbServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {
		ServletConfig cfg = getServletConfig();
		String tableName = cfg.getInitParameter("TABLE");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<h2>Servlet config parameter: Table => " + 
		tableName+"</h2>");
	
		ServletContext ctx = getServletContext();
		String db = ctx.getInitParameter("DB");
		out.write("<h2>DB:" + db +"</h2>");
	}
}

