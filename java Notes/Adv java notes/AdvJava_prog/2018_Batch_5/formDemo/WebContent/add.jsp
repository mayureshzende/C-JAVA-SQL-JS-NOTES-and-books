<%
 int n1 = Integer.parseInt(request.getParameter("num1"));
 int n2 = Integer.parseInt(request.getParameter("num2"));
 int ans = n1 + n2;
%>
<h2> <%=n1%> + <%=n2%> = <%=ans%> </h2>