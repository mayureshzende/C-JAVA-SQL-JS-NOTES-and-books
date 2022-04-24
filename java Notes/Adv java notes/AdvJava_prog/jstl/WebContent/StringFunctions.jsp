<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="str" value="JSTL String functions"/>

<c:out value="${fn:toUpperCase(str)}"/>
<c:out value="${fn:length(str)}"/>
<c:out value="${fn:startsWith(str, \"abc\")}"/>
<c:out value="${fn:substring(str, 5, 8)}"/>
