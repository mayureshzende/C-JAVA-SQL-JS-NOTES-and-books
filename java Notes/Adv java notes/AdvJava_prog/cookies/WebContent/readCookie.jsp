<%
  Cookie[] arr = request.getCookies();
  for(Cookie c : arr) {
%>
<h4> <%=c.getName()%> => <%=c.getValue()%></h4>
<%
  }
%>