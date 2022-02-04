package com.Ait;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Login() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		String uname=request.getParameter("fname");
		String pass=request.getParameter("pass");
		ArrayList<String>arr=new ArrayList<>();
		arr.add("java");
		arr.add("c++");
		arr.add("python");
		arr.add("c#");
		request.setAttribute("technical", arr);
		if(uname.equalsIgnoreCase("Admin")&&pass.equalsIgnoreCase("1234")) 
		{
			RequestDispatcher rd=request.getRequestDispatcher("welcome");
			rd.forward(request, response);
//			response.sendRedirect("welcome");
		}
		else {
			response.setContentType("text/html");
			out.println("<html>");
			out.println("<body>");
			out.println("<h1 align='center'>Login Unsuccessfull!!</h1>");
			out.println("</body></html>");
			RequestDispatcher rd=request.getRequestDispatcher("index.html");
			rd.include(request, response);
			out.println("please re-enter details");
		}
			
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request,response);
	}

}
