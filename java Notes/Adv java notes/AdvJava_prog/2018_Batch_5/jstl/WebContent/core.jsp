<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:out value="JSTL Core Demo"/>
<table border="1">
 <c:forEach begin="1" end="10" var="i">
 	<TR> <TD> ${i} </TD> </TR>
 </c:forEach>
</table>

<!-- Setting variable salary with value 5000  -->
<c:set var="salary" value="5000"/>

<!--  Check salary value using if condition -->
<c:if test="${salary > 4000 }">
 <h4> Salary is > 4000 </h4>
</c:if>

<c:set var="num" value="50"/>
<!--  Check odd/even -->
<c:choose>
	<c:when test="${num % 2 == 0}">
		<h4>  Number ${num} is EVEN </h4>
	</c:when>
	<c:otherwise>
		<h4> Number ${num} is ODD </h4>
	</c:otherwise>
</c:choose>

