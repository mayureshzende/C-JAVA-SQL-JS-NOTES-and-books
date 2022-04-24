<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="n" value="${param.num}"/>
<table border="1">
 <c:forEach begin="1" end="10" var="i">
 	<tr>
 		<td><c:out value="${n} * ${i}"></c:out></td>
 		<td><c:out value="${n * i}"></c:out></td>
 	</tr>
 </c:forEach>
</table>
