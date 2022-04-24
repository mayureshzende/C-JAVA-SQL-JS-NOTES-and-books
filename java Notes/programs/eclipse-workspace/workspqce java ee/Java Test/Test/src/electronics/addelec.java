//package electronics;
//
//
//
//
//import java.io.*;
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.*;
//
//@WebServlet("/addelec")
//public class addelec extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//	protected void doPost(HttpServletRequest request,
//			HttpServletResponse response) 
//					throws ServletException, IOException {
//	   HttpSession session = request.getSession();
//	   el_dt e = (el_dt)session.getAttribute("ele");
//	   e.setid(e.getMarks();
//	   session.setAttribute("ele", e);
//	   RequestDispatcher rd =
//			   request.getRequestDispatcher("ins.jsp");
//	   rd.forward(request, response);
//	}
//}
//
//
//
//
//
//
//
