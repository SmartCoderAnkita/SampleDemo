<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Information</title>
</head>
<body>
<h1>${headerName}</h1>
<h4>${formName}</h4>
<table>
<tr><td>Student Name      :  </td><td>	${student.getStudentName()}</td></tr>
<tr><td>Student Hobby     :  </td><td>	${student.getStudentHobby()}</td></tr>
<tr><td>Student MobileNo  :  </td><td>	${student.getStudentMobileNo()}</td></tr>
<tr><td>Student DOB       :  </td><td>	${student.getStudentDOB()}</td></tr>
<tr><td>Student Skills    :  </td><td>	${student.getStudentSkills()}</td></tr>
<tr><td>Student Address   :  </td></tr>           
<tr><td>Country      	  :  </td><td>	${student.getStudentAddress().getCountry()}</td></tr>
<tr><td>State      		  :  </td><td>	${student.getStudentAddress().getState()}</td></tr>
<tr><td>Street  	   	  :  </td><td>	${student.getStudentAddress().getStreet()}</td></tr>
<tr><td>Pincode	      	  :  </td><td>	${student.getStudentAddress().getPincode()}</td></tr>
</table>

</body>
</html>