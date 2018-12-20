<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admission Form</title>
</head>
<body>
<h1>${headerName}</h1>
<h4>${formName}</h4>
<form action="${project}admission_success" method="POST">
<table>
<tr><td>Student Name      :  </td><td>	<input type="text" name="studentName"/></td></tr>
<tr><td>Student Hobby     :  </td><td>	<input type="text" name="studentHobby"/></td></tr>
<tr><td>Student MobileNo  :  </td><td>	<input type="text" name="studentMobileNo"/></td></tr>
<tr><td>Student DOB       :  </td><td>	<input type="text" name="studentDOB"/></td></tr>
<tr><td>Student Skills    :  </td><td>	<select name="studentSkills" multiple="multiple">
										<option value="JAVA">JAVA</option>
										<option value="CPP">CPP</option>
										<option value="ORACLE">ORACLE</option>
										</td></tr>
<tr><td>Student Address   :  </td></tr>
<tr><td>Country      	  :  </td><td>	<input type="text" name="studentAddress.Country"/></td></tr>
<tr><td>State      		  :  </td><td>	<input type="text" name="studentAddress.State"/></td></tr>
<tr><td>Street  	   	  :  </td><td>	<input type="text" name="studentAddress.Street"/></td></tr>
<tr><td>Pincode	      	  :  </td><td>	<input type="text" name="studentAddress.Pincode"/></td></tr>
<tr><td><input type="submit" value="Submit"/></td></tr>
</table>
</form>
</body>
</html>