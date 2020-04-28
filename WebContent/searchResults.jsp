


<%@page import = "java.util.ArrayList"%>
<%@page import = "Account.*" %>
<%@page import = "user.*" %>
<%@page import = "DB.*" %>
<%@page import = "Criteria.Criteria" %>
<%@page import = "university.*" %>
<html>
<head>
<title>Search Result</title>
</head>


<%
AccountController AC = (AccountController)session.getAttribute("AC");
DBController dataBase = new DBController("goldencircle","csci230");
UserController UC = new UserController();
UC.createDataBase(dataBase, AC);



String school = request.getParameter("school");
String state = request.getParameter("state");
String location = request.getParameter("location");
String control = request.getParameter("control");
int numStudents1 = Integer.parseInt(request.getParameter("numberOfStudents1"));
int numStudents2 = Integer.parseInt(request.getParameter("numberOfStudents2"));
double female1 = Double.parseDouble(request.getParameter("female1"));
double female2 = Double.parseDouble(request.getParameter("female2"));
double male1 = 0.0;
double male2 = 0.0;
int satVerbal1 = Integer.parseInt(request.getParameter("satVerbal1"));
int satVerbal2 = Integer.parseInt(request.getParameter("satVerbal2"));
int satMath1 = Integer.parseInt(request.getParameter("satMath1"));
int satMath2 = Integer.parseInt(request.getParameter("satMath2"));
double expense1 = Double.parseDouble(request.getParameter("expenses1"));
double expense2 = Double.parseDouble(request.getParameter("expenses2"));
double financialAid1 = Double.parseDouble(request.getParameter("financialAid1"));
double financialAid2 = Double.parseDouble(request.getParameter("financialAid2"));
int numberOfApplicants1 = Integer.parseInt(request.getParameter("numberOfApplicants1"));
int numberOfApplicants2 = Integer.parseInt(request.getParameter("numberOfApplicants2"));
double admitted1 = Double.parseDouble(request.getParameter("admitted1"));
double admitted2 = Double.parseDouble(request.getParameter("admitted2"));
double enrolled1 = Double.parseDouble(request.getParameter("enrolled1"));
double enrolled2 = Double.parseDouble(request.getParameter("enrolled2"));
int academicScale1 = Integer.parseInt(request.getParameter("academicScale1"));
int academicScale2 = Integer.parseInt(request.getParameter("academicScale2"));
int socialScale1 = Integer.parseInt(request.getParameter("socialScale1"));
int socialScale2 = Integer.parseInt(request.getParameter("socialScale2"));
int qualityOfLife1 = Integer.parseInt(request.getParameter("qualityOfLife1"));
int qualityOfLife2 = Integer.parseInt(request.getParameter("qualityOfLife2"));
ArrayList<String> emphases = new ArrayList<String>();
if(request.getParameter("emphases1").equals("")){
	
}
else{
	emphases.add(request.getParameter("emphases1"));
}
if(request.getParameter("emphases2").equals("")){
	
}
else{
	emphases.add(request.getParameter("emphases2"));
}
if(request.getParameter("emphases3").equals("")){

}
else{
	emphases.add(request.getParameter("emphases3"));
}
if(request.getParameter("emphases4").equals("")){
	
}
else{
	emphases.add(request.getParameter("emphases4"));
}
if(request.getParameter("emphases5").equals("")){
	
}
else{
	emphases.add(request.getParameter("emphases5"));
}






Criteria searchCriteria = new Criteria(school, state, location, control, numStudents1, numStudents2, female1, female2,male1,male2, satVerbal1, satVerbal2, satMath1, satMath2, expense1, expense2, financialAid1, financialAid2, numberOfApplicants1, numberOfApplicants2, admitted1, admitted2,enrolled1, enrolled2, academicScale1, academicScale2, socialScale1, socialScale2, qualityOfLife1, qualityOfLife2, emphases);

ArrayList<University> results = UC.searchSchool((String)session.getAttribute("uName"), searchCriteria);



%>

<body>
	 <a href="searchMenu.jsp">Go back to Search Menu</a><br>
<table style="text-align: left; width: 100%;" border="1" cellpadding="2"
cellspacing="2">
<tbody>

	 
     
<tr align="center">

<td colspan="3" rowspan="1" style="vertical-align: top;">
School 
</td>

</tr>

<%for (int i = 0; i < results.size();i++){
	String schoolName = results.get(i).getName();
	
	
	%>

<tr>
<td style="vertical-align: top;">
<form method="post" action="saveSchoolAction.jsp" >
    <input name="save" value="Save" type="submit">
    <input name="Username" value="???" type="hidden">
    <input name="savedSchool" value=<%=schoolName%> type="hidden">
</form>
</td>

<td style="vertical-align: middle;"> <%=schoolName%>
</td>
<td>
<form method="post" action="viewSearchedSchoolPage.jsp" name="View">
   <input name="View" value="view" type="submit">
    <input name="Username" value="???" type="hidden">
    <input name="school" value=<%=schoolName%> type="hidden">
   </form> </td>


</tr>
<%} %>
</tbody>
</table>
</body>
</html>

