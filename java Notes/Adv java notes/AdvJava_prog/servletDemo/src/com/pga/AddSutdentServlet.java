package com.pga;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/addStudent")
public class AddSutdentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) 
					throws ServletException, IOException {
	   HttpSession session = request.getSession();
	   Student s = (Student)session.getAttribute("stud");
	   s.setMarks(s.getMarks()+5);
	   session.setAttribute("stud", s);
	   RequestDispatcher rd =
			   request.getRequestDispatcher("insertStudent.jsp");
	   rd.forward(request, response);
	}
}







