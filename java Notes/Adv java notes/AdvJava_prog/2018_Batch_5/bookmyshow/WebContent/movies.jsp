<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="CITY" value="${param.city}" scope="session"/>
<c:set var="CINEMA_HALL" value="${param.cinemaHall}" scope="session"/>

<HTML>
 <form action="date.jsp">
	Select Movie
	   <select name="movie">
  	<option value="Movie1">Movie1 </option>
  	<option value="Movie2">Movie2</option>
  	<option value="Movie3">Movie3</option>
  	<option value="Movie4">Movie4</option>
  	</select>
 	<input type="submit" value="NEXT>>>"/>
 </form>
</HTML>