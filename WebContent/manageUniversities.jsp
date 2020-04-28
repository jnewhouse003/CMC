<%@ page import = "DB.*" %>
<%@page import = "java.util.ArrayList" %>
<html>
<head>
<title></title>
</head>
<body>
<% DBController dataBase = new DBController("goldencircle","csci230");

%>
<a href="adminMenu.jsp">back to menu</a><br>
<table style="text-align: left; width: 100%;" border="1" cellpadding="2"
cellspacing="2">
<tbody>

	
<tr align="center">

<td colspan="17" rowspan="1" style="vertical-align: top;"><a href="addUniversity.jsp">ADD a new University</a>
</td>

</tr>
<tr>
<td style="vertical-align: top;">School</td>
<td style="vertical-align: top; text-align: center;">State </td>
<td style="vertical-align: top; text-align: center;">Location </td>
<td style="vertical-align: top; text-align: center;">Control</td>
<td style="vertical-align: top; text-align: center;"># of Students</td>
<td style="vertical-align: top; text-align: center;">% Females</td>
<td style="vertical-align: top; text-align: center;">SAT Verbal</td>
<td style="vertical-align: top; text-align: center;">SAT Math</td>
<td style="vertical-align: top; text-align: center;">Expenses</td>
<td style="vertical-align: top; text-align: center;">% with Financial Aid</td>
<td style="vertical-align: top; text-align: center;">% of Applicants</td>
<td style="vertical-align: top; text-align: center;">% Admitted</td>
<td style="vertical-align: top; text-align: center;">% Enrolled</td>
<td style="vertical-align: top; text-align: center;">Academics Scale (1 - 5)</td>
<td style="vertical-align: top; text-align: center;">Social Scale (1 - 5)</td>
<td style="vertical-align: top; text-align: center;">Quality of Life Scale (1 - 5)</td>
<td style="vertical-align: top;"></td>
</tr>



<%
for(int i = 0; i < dataBase.findallUniversity().size();i++){
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
<tr>
<td style="vertical-align: top;"><%=name%></td>
<td style="vertical-align: top;"><%=state%></td>
<td style="vertical-align: top;"><%=location%></td>
<td style="vertical-align: top;"><%=control%></td>
<td style="vertical-align: top;"><%=students%></td>
<td style="vertical-align: top;"><%=female%>td>
<td style="vertical-align: top;"><%=verbal%></td>
<td style="vertical-align: top;"><%=math%></td>
<td style="vertical-align: top;"><%=expenses%></td>
<td style="vertical-align: top;"><%=financialAid%></td>
<td style="vertical-align: top;"><%=applicants%></td>
<td style="vertical-align: top;"><%=admitted%></td>
<td style="vertical-align: top;"><%=enrolled%></td>
<td style="vertical-align: top;"><%=academic%></td>
<td style="vertical-align: top;"><%=social%></td>
<td style="vertical-align: top;"><%=life%></td>
<td>
<form method="post" action="viewOrEditUniversity.jsp" style=" text-align: center;">
    <input name="edit" value="Edit" type="submit" style="vertical-align: center;">
    <input name="pname" value="<%=name%>" type="hidden">
</form>
</td>
<%} %>
</tr>
</tbody>
</table>

</body>
</html>


