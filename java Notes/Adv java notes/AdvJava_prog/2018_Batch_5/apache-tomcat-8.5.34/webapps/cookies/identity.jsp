<%
	Cookie[] arr = request.getCookies();
	String name = "NOT Found";
	for(Cookie c : arr) {
		if(c.getName().equals("REVERSE")) {
			String rev = c.getValue();//EE2J
			name = new StringBuffer(rev).reverse().toString();
			break;
		}
	}
%>
<h1> Your name is <%=name%></h1>