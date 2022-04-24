<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- Creating connection object with name 'con' -->
<sql:setDataSource var="con" 
	driver="com.mysql.jdbc.Driver"
	url="jdbc:mysql://localhost/college"
	user="root"
	password=""
	scope="session"/>
	
<sql:update dataSource="${con}" sql="insert into student values(?,?,?)">
	<sql:param value="8"/>
	<sql:param value="JSTL-2"/>
	<sql:param value="77"/>
</sql:update>
<sql:update dataSource="${con}" sql="update student set marks=? where id=?">
	<sql:param value="90"/>
	<sql:param value="1"/>
</sql:update>
<sql:update dataSource="${con}" sql="delete from student where id=?">
	<sql:param value="3"/>
</sql:update>

<sql:query dataSource="${con}" var="result" sql="select * from student"/>
<table border="1">
 <tr><th> Roll no. </th> <th> Name </th> <th> Marks </th></tr>
 
 <c:forEach items="${result.rows}" var="stud">
 	<tr>
 	 <td><c:out value="${stud.id}"/></td>
 	 <td><c:out value="${stud.name}"/></td>
 	 <td><c:out value="${stud.marks}"/></td>
 	</tr>
 </c:forEach>
 
</table>














