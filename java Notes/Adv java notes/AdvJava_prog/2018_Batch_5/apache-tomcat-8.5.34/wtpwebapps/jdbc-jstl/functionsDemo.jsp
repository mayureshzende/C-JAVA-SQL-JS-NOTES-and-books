<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="str" value="We are learning jstl"/>
Lenght is : ${fn:length(str)}
<c:set var="substr" value="${fn:substring(str,3,9)}"/>
Substring : ${substr }
Upper case : ${fn:toUpperCase(str)}
