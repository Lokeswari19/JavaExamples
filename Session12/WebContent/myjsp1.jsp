<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
This is HTML
	<br/>
	<p>This is a Paragraph</p>
	<br/>
	 <h3>This is heading3</h3>
		<br/>
		<%!
		//Declarative tag
		float pi=3.14F;
		
		int squareOfNum(int num){
			return (num * num);
		}
		
		%>
		Scriptlet
		<br/>
		<%
		//Scriptlet is a tag to write the Java code
		
			int num=5;
			int a =20;
			int b=20;
			int c=a+b;
			
			for (int i=1;i<=10;i++){
				out.print(num+"  " + i+"'s are  " +(num*i) + "<br/>");
			}
			
			out.print("Sum is   " + c);//out is a reference fr PrintWriter object of response. *(Implicit object)
		
		%>
		
		<br/>
		<br/>
		
		Declarative example
		<%
		out.println("Pi is :" + pi +"<br/>" );
		out.println("Square of 5 is " + squareOfNum(5) +"<br/>");
		 %>	 
		 
		<br/>
		<br/>		
		Expression example
		<br/>
		
		pi is : <%= pi %>		
		<br/>
		Square of 7 is : <%= squareOfNum(7) %>
		
		<br/>
	
</body>
</html>