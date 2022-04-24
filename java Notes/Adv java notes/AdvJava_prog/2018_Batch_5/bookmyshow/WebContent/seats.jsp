<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="DATE" value="${param.date}" scope="session"/>

<form action="summary.jsp">
Number of Seats:

<input type="text" name="noOfSeats">
<input type="submit" value="Next>>"/>

</form>
