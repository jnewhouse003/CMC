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
<form method="post" action="editUniversityAction.jsp" name="addUniverity"><br>
<table style="text-align: left; width: 55%;" border="1" cellpadding="2"
cellspacing="2">
<tbody>
<a href="manageUniversities.jsp">back to Universities</a>
<% 
for(int i = 0; i < dataBase.findallUniversity().size();i++){
	if(request.getParameter("pname").equals(dataBase.findallUniversity().get(i).getName())){
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
<td><input name="state" value="<%=state%>" ><br></td>
</tr>
<tr align="LEFT">

<td colspan="2" rowspan="1" style="vertical-align: top;">LOCATION</td>
<td><input name="location" value="<%=location%>" ><br></td>
</tr>
<tr align="LEFT">

<td colspan="2" rowspan="1" style="vertical-align: top;">CONTROL</td>
<td><input name="control" value="<%=control%>" ><br></td>
</tr>
<tr align="LEFT">

<td colspan="2" rowspan="1" style="vertical-align: top;">NUMBER OF STUDENTS</td>
<td><input name="numberOfStudents" value="<%=students%>" ><br></td>
</tr>
<tr align="LEFT">

<td colspan="2" rowspan="1" style="vertical-align: top;">% FEMALE</td>
<td><input name="female" value="<%=female%>" ><br></td>
</tr>

<tr align="LEFT">

<td colspan="2" rowspan="1" style="vertical-align: top;">SAT VERBAL</td>
<td><input name="satVerbal" value="<%=verbal%>" ><br></td>
</tr>

<tr align="LEFT">

<td colspan="2" rowspan="1" style="vertical-align: top;">SAT MATH</td>
<td><input name="satMath" value="<%=math%>" ><br></td>
</tr>

<tr align="LEFT">

<td colspan="2" rowspan="1" style="vertical-align: top;">EXPENSES</td>
<td><input name="expenses" value="<%=expenses%>" ><br></td>
</tr>

<tr align="LEFT">
<td colspan="2" rowspan="1" style="vertical-align: top;">% FINANCIAL AID</td>
<td><input name="financialAid" value="<%=financialAid%>" ><br></td>
</tr>


<tr align="LEFT">
<td colspan="2" rowspan="1" style="vertical-align: top;">NUMBER OF APPLICANTS</td>
<td><input name="numberOfApplicants" value="<%=applicants%>" ><br></td>
</tr>

<tr align="LEFT">
<td colspan="2" rowspan="1" style="vertical-align: top;">% ADMITTED</td>
<td><input name="admitted" value="<%=admitted%>" ><br></td>
</tr>

<tr align="LEFT">
<td colspan="2" rowspan="1" style="vertical-align: top;">% ENROLLED</td>
<td><input name="enrolled" value="<%=enrolled%>" ><br></td>
</tr>

<tr align="LEFT">
<td colspan="2" rowspan="1" style="vertical-align: top;">ACADEMIC SCALE (1 - 5)</td>
<td><input name="academicScale" value=<%=academic%> ><br></td>
</tr>

<tr align="LEFT">
<td colspan="2" rowspan="1" style="vertical-align: top;">SOCIAL SCALE (1 - 5)</td>
<td><input name="socialScale" value="<%=social%>" ><br></td>
</tr>

<tr align="LEFT">
<td colspan="2" rowspan="1" style="vertical-align: top;">QUALITY OF LIFE SCALE (1 - 5)</td>
<td><input name="qualityOfLife" value="<%=life%>" ><br></td>
</tr>

<tr align="LEFT">
<td colspan="2" rowspan="1" style="vertical-align: top;">EMPASES</td>
<td>
<input name="financialAid1" value="" ><br>
<input name="financialAid2" value="" ><br>
<input name="financialAid3" value="" ><br>
<input name="financialAid4" value="" ><br>
<input name="financialAid5" value="" ><br>
</td>
</tr>
</table>
<input value="APPLY CHANGES" name="apply" type="submit">
<input value="CANCLE CHANGES" name="cancle" type="reset">
<br>
<%}
	}%>
</form>
</body>
</html>