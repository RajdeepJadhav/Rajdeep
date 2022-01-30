package com.Session;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DemoCookie1")
public class DemoCookie1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public DemoCookie1() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			Cookie ck=new Cookie("name","rajdeep");
			PrintWriter pt=response.getWriter();
			pt.println("<html>");
			pt.println("<body><h1>Welcome user</h1></body>");
			pt.println("</html>");
			response.addCookie(ck);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
