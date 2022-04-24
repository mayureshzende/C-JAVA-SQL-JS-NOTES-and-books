<jsp:useBean id="stud" class="com.pga.Student" scope="session"/>
<jsp:setProperty property="id" name="stud" value="${param.id}"/>
<jsp:setProperty property="name" name="stud" value="${param.name}"/>
<jsp:setProperty property="marks" name="stud" value="${param.marks}"/>

<!--  OR 
<jsp:setProperty property="*" name="stud"/>
For this HTML field names and POJO field names must be same
 -->

<h4>Student object is stored in session>>> </h4>
<a href="readStudent.jsp"> NEXT </a>
