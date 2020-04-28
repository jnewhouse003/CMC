<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "DB.*" %>
    <%@page import = "java.util.ArrayList" %>
    <%@page import = "university.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <%DBController dataBase = new DBController("goldencircle","csci230");%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>View School Page</title>
</head>
<body>
<button type="button" name="back" onclick="history.back()">back</button><br>
<table style="text-align: left; width: 50%;" border="1" cellpadding="2"
cellspacing="2">
<tbody>
<%
	University foundSchool = dataBase.getUniversity(request.getParameter("school"));
	String name = foundSchool.getName();
	String state = foundSchool.getState();
	String control = foundSchool.getControl();
	int students = foundSchool.getNumStudents();
	double female = foundSchool.getPercentFemale();
	double admitted = foundSchool.getPercentAdmitted();
	double male = foundSchool.getPercentMale();
	int verbal = foundSchool.getVerbalSAT();
	int math = foundSchool.getMathSAT();
	double financialAid = foundSchool.getFinancialAid();
	double expenses = foundSchool.getExpenses();
	int applicants = foundSchool.getNumApplications();
	double enrolled = foundSchool.getPercentEnrolled();
	int academic = foundSchool.getAcademicsScale();
	int social = foundSchool.getSocialScale();
	int life = foundSchool.getLifeQualityScale();
	ArrayList<String> e = foundSchool.getEmphases();
	String location = foundSchool.getLocation();
	
	

  %>
     
<tr align="LEFT">

<td colspan="2" rowspan="1" style="vertical-align: top;">SCHOOL</td>
<td><input name="school" value="<%=name%>" size = "50" readonly><br></td>
</tr>
<tr align="LEFT">
<td colspan="2" rowspan="1" style="vertical-align: top;">STATE</td>
<td><input name="state" value="<%=state%>" readonly><br></td>
</tr>
<tr align="LEFT">

<td colspan="2" rowspan="1" style="vertical-align: top;">LOCATION</td>
<td><input name="location" value="<%=location%>" readonly><br></td>
</tr>
<tr align="LEFT">

<td colspan="2" rowspan="1" style="vertical-align: top;">CONTROL</td>
<td><input name="control" value="<%=control%>" readonly><br></td>
</tr>
<tr align="LEFT">

<td colspan="2" rowspan="1" style="vertical-align: top;">NUMBER OF STUDENTS</td>
<td><input name="numberOfStudents" value="<%=students%>" readonly><br></td>
</tr>
<tr align="LEFT">

<td colspan="2" rowspan="1" style="vertical-align: top;">% FEMALE</td>
<td><input name="female" value="<%=female%>"readonly ><br></td>
</tr>

<tr align="LEFT">

<td colspan="2" rowspan="1" style="vertical-align: top;">SAT VERBAL</td>
<td><input name="satVerbal" value="<%=verbal%>"readonly ><br></td>
</tr>

<tr align="LEFT">

<td colspan="2" rowspan="1" style="vertical-align: top;">SAT MATH</td>
<td><input name="satMath" value="<%=math%>" readonly><br></td>
</tr>

<tr align="LEFT">

<td colspan="2" rowspan="1" style="vertical-align: top;">EXPENSES</td>
<td><input name="expenses" value="<%=expenses%>" readonly><br></td>
</tr>

<tr align="LEFT">
<td colspan="2" rowspan="1" style="vertical-align: top;">% FINANCIAL AID</td>
<td><input name="financialAid" value="<%=financialAid%>" readonly><br></td>
</tr>


<tr align="LEFT">
<td colspan="2" rowspan="1" style="vertical-align: top;">NUMBER OF APPLICANTS</td>
<td><input name="numberOfApplicants" value="<%=applicants%>" readonly><br></td>
</tr>

<tr align="LEFT">
<td colspan="2" rowspan="1" style="vertical-align: top;">% ADMITTED</td>
<td><input name="admitted" value="<%=admitted%>" readonly><br></td>
</tr>

<tr align="LEFT">
<td colspan="2" rowspan="1" style="vertical-align: top;">% ENROLLED</td>
<td><input name="enrolled" value="<%=enrolled%>" readonly><br></td>
</tr>

<tr align="LEFT">
<td colspan="2" rowspan="1" style="vertical-align: top;">ACADEMIC SCALE (1 - 5)</td>
<td><input name="academicScale" value=<%=academic%> readonly><br></td>
</tr>

<tr align="LEFT">
<td colspan="2" rowspan="1" style="vertical-align: top;">SOCIAL SCALE (1 - 5)</td>
<td><input name="socialScale" value="<%=social%>" readonly><br></td>
</tr>

<tr align="LEFT">
<td colspan="2" rowspan="1" style="vertical-align: top;">QUALITY OF LIFE SCALE (1 - 5)</td>
<td><input name="qualityOfLife" value="<%=life%>" readonly><br></td>
</tr>

<tr align="LEFT">
<td colspan="2" rowspan="1"  style="vertical-align: top;">EMPASES</td>
<td>
<%for (int j = 0; j < e.size(); j++){ %>
<input name="financialAid1" value="<%=e.get(j)%>" size = "30"  readonly><br>
<%} %>
</td>
</tr>
</table>

<br>
<%
	%>

</body>
</html>