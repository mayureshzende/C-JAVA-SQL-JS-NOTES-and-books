
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<sql:setDataSource var="con" 
	driver="oracle.jdbc.driver.OracleDriver"
	url="jdbc:oracle:thin:@localhost:1521:xe"
	user="mayur"
	password="777"/>

<sql:update dataSource="${con}" sql="insert into el_dt values(?,?,?)">
	<sql:param value="${sessionScope.ele.id}"/>
	<sql:param value="${sessionScope.ele.name}"/>
	<sql:param value="${sessionScope.ele.devices}"/>
</sql:update>
<h1> Student record added...</h1>