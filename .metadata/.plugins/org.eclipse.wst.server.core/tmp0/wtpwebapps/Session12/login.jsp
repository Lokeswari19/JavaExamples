<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
		Welcome, ${param.txtUserName}
		<br/>
		<%
		String username=request.getParameter("txtUserName");
		String password = request.getParameter("txtPassword");
		
		if (username.equals("admin@example.com") && password.equals("admin123")){
			String name="John Watson";
			int age=30;
			session.setAttribute("keyAdminId", username);
			session.setAttribute("keyName", name);
			session.setAttribute("keyAge", String.valueOf(age));
			
			//pageContext.setAttribute("keyName",name, PageContext.SESSION_SCOPE);
			//session.invalidate(); // will clear all the data from session.
			
			//When user logs in ,you dump same key value pair in session
			//when user logs out you invalidate the session
			//In between the session keep on checking your dumped key value for session to be active
			
		%>
			<p> Welcome Admin </p>
			<br/>
			<a href="welcome.jsp"> Enter Home here</a>
		<%
		}else{
			response.sendRedirect("https://www.google.com");
		}
		%>
		
</body>
</html>