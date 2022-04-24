<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="n" value="${param.num}"/>
<h1> TEST </h1>
<c:choose>
 <c:when test="${n%2==0}">
 	<jsp:forward page="even.jsp">
 	 <jsp:param value="${n}" name="NUM"/>
 	</jsp:forward>
 </c:when>
 <c:otherwise>
 	<%
 	 response.sendRedirect("odd.jsp?NUM=" + pageContext.getAttribute("n"));
 	%>
 </c:otherwise>
</c:choose>
