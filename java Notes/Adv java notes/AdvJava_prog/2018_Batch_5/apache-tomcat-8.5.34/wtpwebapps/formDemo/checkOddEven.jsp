<%
 //How to read data from request using Scriptlet
 int n = Integer.parseInt(request.getParameter("num"));
 if (n%2 == 0) {
%>
<h4> Number <%=n%> is EVEN</h4>
<%
 } else {
%>
<h4> Number <%=n%> is ODD </h4>
<%
 }
%>