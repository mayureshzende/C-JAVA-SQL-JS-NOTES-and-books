<h1> Welcome to our site !!! </h1>

<%
	Integer cnt = (Integer)application.getAttribute("COUNT");
	if (cnt == null) {
		cnt = 1;
	} else {
		cnt++;
	}
	application.setAttribute("COUNT", cnt);
%>
<a href="./visitCount"> Visit Count </a>