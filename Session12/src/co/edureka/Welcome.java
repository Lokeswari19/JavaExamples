package co.edureka;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Cookie;


/**
 * Servlet implementation class Welcome
 */
@WebServlet("/Welcome")
public class Welcome extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String uname=request.getParameter("txtUserName"); //extracting the data from Request
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		//out.print("Welcome dear, " + "" +"<br/>");
		/*Cookie[] ckArr=request.getCookies();
		//out.print(ckArr.length);
		for( Cookie c: ckArr){
			out.print(c.getName()+" - " + c.getValue() +"<br/>");
		}*/
		//String name=request.getParameter("txtName");
		//String age=request.getParameter("txtAge");
		
		HttpSession session=request.getSession();
		
		String name=(String)session.getAttribute("keyName");
		String age=(String)session.getAttribute("keyAge");
		out.print("Welcome Dear, "+name +"<br/> Your Age is :" +age);
	}

}