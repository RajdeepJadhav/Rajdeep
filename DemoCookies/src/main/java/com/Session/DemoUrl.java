package com.Session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DemoUrl")
public class DemoUrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public DemoUrl() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter pt=response.getWriter();
		pt.println("<html>");
		pt.println("<body><h1>Welcome DemoHidden</h1>");
		pt.println("<form action='hidden2'>");
		pt.println("<input type='hidden' name='username' value='rajdeep'>");
		pt.println("<input type='submit' value='submit'>");
		pt.println("</body></html>");
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
