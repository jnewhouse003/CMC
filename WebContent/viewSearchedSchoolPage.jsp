<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "DB.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <%DBController dataBase = new DBController("goldencircle","csci230");%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>View School Page</title>
</head>
<body>

<table style="text-align: left; width: 45%;" border="1" cellpadding="2"
cellspacing="2">
<tbody>
<%
for(int i = 0; i < dataBase.findallUniversity().size();i++){
	if(request.getParameter("school").equals(dataBase.findallUniversity().get(i).getName())){
	String name = dataBase.findallUniversity().get(i).getName();
	String state = dataBase.findallUniversity().get(i).getState();
	String control = dataBase.findallUniversity().get(i).getControl();
	int students = dataBase.findallUniversity().get(i).getNumStudents();
	double female = dataBase.findallUniversity().get(i).getPercentFemale();
	double admitted = dataBase.findallUniversity().get(i).getPercentAdmitted();
	double male = dataBase.findallUniversity().get(i).getPercentMale();
	int verbal = dataBase.findallUniversity().get(i).getVerbalSAT();
	int math = dataBase.findallUniversity().get(i).getMathSAT();
	double financialAid = dataBase.findallUniversity().get(i).getFinancialAid();
	double expenses = dataBase.findallUniversity().get(i).getExpenses();
	int applicants = dataBase.findallUniversity().get(i).getNumApplications();
	double enrolled = dataBase.findallUniversity().get(i).getPercentEnrolled();
	int academic = dataBase.findallUniversity().get(i).getAcademicsScale();
	int social = dataBase.findallUniversity().get(i).getSocialScale();
	int life = dataBase.findallUniversity().get(i).getLifeQualityScale();
	String e = dataBase.findallUniversity().get(i).getEmphases();
	String location = dataBase.findallUniversity().get(i).getLocation();
	
	

  %>
     
<tr align="LEFT">

<td colspan="2" rowspan="1" style="vertical-align: top;">SCHOOL</td>
<td><input name="school" value="<%=name%>" readonly><br></td>
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
<td colspan="2" rowspan="1" style="vertical-align: top;">EMPASES</td>
<td>
<input name="financialAid1" value="" readonly><br>
<input name="financialAid2" value="" readonly><br>
<input name="financialAid3" value="" readonly><br>
<input name="financialAid4" value="" readonly><br>
<input name="financialAid5" value="" readonly><br>
</td>
</tr>
</table>

<br>
<%}
	}%>

</body>
</html>