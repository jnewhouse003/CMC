<%@ page import = "DB.*" %>
<%@ page import = "university.*" %>

// add new university



<%

	String[] un = new String[16];
un[0] =	request.getParameter("school");
un[1] =	request.getParameter("state");
un[2] =	request.getParameter("location");
un[3] =	request.getParameter("control");
un[4] =	request.getParameter("numberOfStudents");
un[5] =	request.getParameter("female");
un[6] =	request.getParameter("satVerbal");
un[7] =	request.getParameter("satMath");
un[8] =	request.getParameter("expenses");
un[9] =	request.getParameter("financialAid");
un[10] = request.getParameter("numberOfApplicants");
un[11] = request.getParameter("admitted");
un[12] = request.getParameter("enrolled");
un[13] = request.getParameter("academicScale");
un[14] = request.getParameter("socialScale");
un[15] = request.getParameter("qualityOfLife");
DBController dataBase = new DBController("goldencircle","csci230");
University mm = new University(un);
dataBase.addSchool(mm);


 	response.sendRedirect("manageUniversities.jsp");
 %>