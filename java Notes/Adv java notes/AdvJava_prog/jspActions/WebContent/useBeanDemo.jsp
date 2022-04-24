<%@page import="com.pga.Student" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:useBean id="d" class="java.util.Date" scope="session"/>

<h1> Today's date is <c:out value="${d}"/> </h1>

<jsp:useBean id="stud" class="com.pga.Student" scope="session"/>
<jsp:setProperty name="stud" property="id" value="5"/>
<jsp:setProperty name="stud" property="name" value="Fred"/>
<jsp:setProperty name="stud" property="marks" value="71"/>

<a href="next.jsp">Click here</a>