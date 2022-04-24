<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<sql:setDataSource var="con" 
	driver="com.mysql.jdbc.Driver"
	url="jdbc:mysql://localhost/college"
	user="root"
	password=""/>

<sql:update dataSource="${con}" sql="insert into student values(?,?,?)">
	<sql:param value="${sessionScope.stud.rollNo}"/>
	<sql:param value="${sessionScope.stud.name}"/>
	<sql:param value="${sessionScope.stud.marks}"/>
</sql:update>
<h1> Student record added...</h1>