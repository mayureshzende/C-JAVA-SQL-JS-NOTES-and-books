<h1> Welcome to our site!!! </h1>

<%
  System.out.println("HOME PAGE");
  Integer cnt = (Integer)application.getAttribute("COUNT");
  if(cnt == null) {
	  cnt = 1;
  } else {
	  cnt++;
  }
  application.setAttribute("COUNT",cnt);
%>
<a href="./showCount">  Show visitor count...</a>