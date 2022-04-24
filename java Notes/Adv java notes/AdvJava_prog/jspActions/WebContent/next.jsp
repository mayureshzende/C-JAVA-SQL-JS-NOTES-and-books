<%@page import="java.util.Date" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:useBean id="stud" class="com.pga.Student" scope="session"/>
<Table border="1">
	<tr>
		<Td> ID </Td>
		<td> <jsp:getProperty name="stud" property="id"/> </td>
	</tr>
	<tr>
		<td>NAME</td>
		<td><jsp:getProperty name="stud" property="name"/></td>
	</tr>
	<tr>
		<td>MARKS</td>
		<td> <jsp:getProperty name="stud" property="marks"/></td>
	</tr>
</Table>





