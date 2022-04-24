<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<sql:setDataSource
	driver="com.mysql.jdbc.Driver"
	user="root"
	password=""
	url="jdbc:mysql://localhost/pga"
	var="con"/>

<sql:update dataSource="${con}"
		sql="insert into student values(?,?,?)">
	<sql:param value="${param.id}"/>
	<sql:param value="${param.name}"/>
	<sql:param value="${param.marks}"/>
</sql:update>
<sql:update dataSource="${con}"
		sql="update student set marks=? where rollNo=?">
	<sql:param value="${param.marks}"/>
	<sql:param value="${param.id}"/>
</sql:update>
<sql:update dataSource="${con}"
		sql="delete from student where rollNo=?">
	<sql:param value="${param.id}"/>
</sql:update>


<h3> Record saved successfully... </h3>






