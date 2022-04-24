<jsp:useBean id="stud" class="com.pga.Student" scope="session"/>

<table>
 <tr>
 	<th> Roll Number </th>
 	<td> <jsp:getProperty property="id" name="stud"/></td>
 </tr>
  <tr>
 	<th> Name </th>
 	<td> <jsp:getProperty property="name" name="stud"/></td>
 </tr> <tr>
 	<th> Marks </th>
 	<td> <jsp:getProperty property="marks" name="stud"/></td>
 </tr>
</table>
