JSTL Core tags demo

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="name" value="PGA"/>
<c:set var="salary" value="1500"/>
<h1> Name is <c:out value="${name}"></c:out> </h1>
<h1><c:out value="Welcome To JSTL!!!!"/></h1>

<c:if test="${salary > 5000 }">
	<c:out value="Salary is > 5000"></c:out>
</c:if>

<!--  If-else -->
<c:choose>
	<c:when test="${salary > 5000 }">
		<c:out value="Salary is > 5000"></c:out>
	</c:when>
	<c:otherwise>
		<c:out value="Salary is < 5000"></c:out>
	</c:otherwise>
</c:choose>

<table border="1">
<c:forEach begin="1" end="10" var="i">
	<tr><td><c:out value="${i}"/></td></tr>
</c:forEach>
</table>






