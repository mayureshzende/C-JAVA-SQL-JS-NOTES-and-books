<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<sql:setDataSource
	driver="com.mysql.jdbc.Driver"
	user="root"
	password=""
	url="jdbc:mysql://localhost/pga"
	var="con"/>

<sql:query dataSource="${con}" var="resultSet"
		sql="select * from student"/>

<table border="1">
 <TR> <th> Roll Number </th> <th> Name </th> <th> Marks </th> </TR>
 <c:forEach items="${resultSet.rows}" var="record">
 	<tr>	
 		<td>${record.rollNo}</td>
 		<td>${record.name}</td>
		<td>${record.marks}</td>
 	</tr>
 </c:forEach>
</table>








