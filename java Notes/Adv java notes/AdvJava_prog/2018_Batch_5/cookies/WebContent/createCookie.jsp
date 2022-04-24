<%
  String name = request.getParameter("userName");
  String rev = new StringBuffer(name).reverse().toString();
  Cookie c = new Cookie("REVERSE", rev);
  c.setMaxAge(60);//1min
  response.addCookie(c);
%>
<h1> cookie got created...</h1>
<a href="identity.jsp"> Who am I? </a>
