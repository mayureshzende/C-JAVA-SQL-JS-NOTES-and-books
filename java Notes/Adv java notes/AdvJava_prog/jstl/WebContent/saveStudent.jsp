<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<%
 //request is in-built object 
 int id = Integer.parseInt(request.getParameter("id"));
 pageContext.setAttribute("id", id);//Required to access this variable in JSTL code
%>
<c:set var="name" value="${param.sName}"/>
<c:set var="marks" value="${param.sMarks}"/>

<sql:update dataSource="${con}"
		sql="insert into student values(?,?,?)">
	<sql:param value="${id}"/>
	<sql:param value="${name}"/>
	<sql:param value="${marks}"/>
</sql:update>

<H1> Student registered successfully... </H1>








