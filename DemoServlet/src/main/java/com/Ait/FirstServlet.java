package com.Ait;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID =1L;
	
	public void doGet(HttpServletRequest req ,HttpServletResponse res) throws IOException 
	{
		PrintWriter pt=res.getWriter();
		pt.println("hello");
		
		String name=req.getParameter("fname");
		String pass=req.getParameter("pass");
		ServletContext ct=req.getServletContext();
		String mail=ct.getInitParameter("companymail");
		pt.println("<html>");
		pt.println("<body bgcolor='red'>");
		pt.println("<h1 align='center'>Welcome "+name+"</h1>");
		pt.println("</body>");
		pt.println("</html>");
		pt.println(mail);
	}
	
	public void doPost()
	{
		
	}

}
