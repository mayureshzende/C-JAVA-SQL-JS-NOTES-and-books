<jsp:useBean id="stud" class="com.pga.Student" scope="session"/>
<jsp:setProperty name="stud" property="*" />
<jsp:forward page="addStudent"/>