<%@page import="co.edureka.Employee"%>
<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page errorPage="error.jsp" %>
 <%@ page isThreadSafe="true" %>
<!-- <%@ include  file="header.jsp" %> --> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Including below
<br/>
<jsp:include page="header.jsp"></jsp:include>
<jsp:useBean id="emp" class="co.edureka.Employee"> 
	<jsp:setProperty property="eid" name ="emp" value="101"></jsp:setProperty>
	<jsp:setProperty property="name" name ="emp" value="John"></jsp:setProperty>
</jsp:useBean>

<br/>
Name is : <jsp:getProperty property="name" name="emp"/>
<br/>
ID   is : <jsp:getProperty property="eid" name="emp"/>

<%

Employee emp1=new Employee();
emp1.setEid(101);

String name=(String)session.getAttribute("keyName");
String age=(String)session.getAttribute("keyAge");

out.print("<br/>Welcome Admin, "+name +"<br/> Your Age is :" +age + "<br/>");
//Date date=new Date();

//out.print("Today is " +date + "<br/>");
int[] arr={10, 20, 30, 40};

out.print("<br/>arr[3] is : "+ arr[3]); //Runtime error
%>
</body>
</html>