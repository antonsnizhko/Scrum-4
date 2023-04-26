<!DOCTYPE HTML><%@page language="java" import="com.Team4_SharkAPI, com.Shark"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Team4_ScrumWeb</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<%
	Team4_SharkAPI api = new Team4_SharkAPI();
	
	Shark returnString = api.createShark(request.getParameter("name"), 
	Integer.parseInt(request.getParameter("teethRows")), 
	Integer.parseInt(request.getParameter("length")), 
	request.getParameter("home"));
	
	out.print(returnString.toString());

 %>

</body>
</html>