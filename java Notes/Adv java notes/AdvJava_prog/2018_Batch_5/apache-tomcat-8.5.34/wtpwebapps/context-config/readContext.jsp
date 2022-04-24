<%
  String db = application.getInitParameter("DB");
  String port = application.getInitParameter("PORT");
%>
<h2> DB: <%=db%> and PORT: <%=port%> </h2>
