package com.Ait;

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

public class ThirdServlet implements Servlet {

   
    public ThirdServlet() {
        // TODO Auto-generated constructor stub
    }

	
	public void init(ServletConfig config) throws ServletException {
	}

	public void destroy() {
		
	}

	
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String getServletInfo() {

		return null; 
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
	
	}

}
