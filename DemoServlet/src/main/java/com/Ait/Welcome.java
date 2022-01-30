package com.Ait;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Welcome() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				PrintWriter pt=response.getWriter();
				String u=request.getParameter("fname");
				pt.println("Welcome user "+u);
				ArrayList<String>ab=(ArrayList)request.getAttribute("technical");
				pt.println(ab);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
