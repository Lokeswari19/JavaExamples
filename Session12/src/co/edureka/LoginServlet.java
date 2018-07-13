package co.edureka;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Cookie;
/**
 * Servlet implementation class LoginServlet
 */
@WebServlet({ "/LoginServlet", "/Login" })
public class LoginServlet extends HttpServlet {
	
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Servlet Init Executed");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("Servlet Destroyed Exected");
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Servlet Service Exected");
		//Extracting the data from Request
		String userName=request.getParameter("txtUserName");
		String password=request.getParameter("txtPassword");
		//Sending back the Response
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		if (userName.equals("admin@example.com") && password.equals("admin123")){			
			out.print("Hello User ," + userName + "<br/>");
			//Here , Lets navigate to other Servlet and dispatching the Request(data) and Response
			//RequestDispatcher is used to perform such action
			
			//RequestDispatcher dispatcher=request.getRequestDispatcher("Welcome");
			//dispatcher.forward(request, response);  // forward the data to welcome Servlet
			
			//Data in Servlet1 has to be Shared with Servlet2
			String name="Joh Wastson";
			int age=20;
			/*
			Cookie c1=new Cookie("keyUname",userName);
			Cookie c2=new Cookie("keyName",name);
			Cookie c3=new Cookie("keyage",String.valueOf(age));
			
			response.addCookie(c1);
			response.addCookie(c2);
			response.addCookie(c3);*/
			/*//Hidden form fields
			out.print("<html><body>");
			out.print("<form action='Welcome' method='post'>");
			out.print("<input type='hidden' name='txtName' value ='"+ name+"'/>");
			out.print("<input type='hidden' name='txtAge' value ='"+ age+"'/>");
			out.print("<input type='submit'  value ='Enter Home'/>");
			
			out.print("</form>");
			out.print("</html></body>");

			*/
			
			//HttpSession to Store the data in the predefined session Object created by Server
			//Client->Request->Server (Server will create on HttpSession Object)
			HttpSession session =request.getSession();
			session.setAttribute("keyName", name);
			session.setAttribute("keyAge", String.valueOf(age));
			out.print("<a href='Welcome'> Enter Home</a>"); //Navigating from S1 to S2 without forward /include req and response
		} else {
			out.print("Invalid Credentials<br/>");
			//RequestDispatcher dispatcher=request.getRequestDispatcher("Login.html");
			//dispatcher.include(request, response);
			response.sendRedirect("https://www.google.com");

		}
	}

}
