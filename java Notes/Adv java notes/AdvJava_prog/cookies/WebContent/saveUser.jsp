<%@page import="java.net.URLEncoder"%>
<%
 String name = request.getParameter("userName");
 System.out.println(name);
 String rev = new StringBuffer(name).reverse().toString();
 
 response.addCookie(new Cookie("MY_REVERSE_NAME", URLEncoder.encode(rev)));
%>