<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="MOVIE" value="${param.movie}" scope="session"/>

<form action="seats.jsp">
Date : <input type="date" name="date"/>
<input type="submit" value="Next>>"/>
</form>