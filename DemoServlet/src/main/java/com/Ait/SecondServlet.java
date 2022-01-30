package com.Ait;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

public class SecondServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
   
	public void service(ServletRequest req ,ServletResponse res) throws IOException 
	{
		PrintWriter out=res.getWriter();
		String u=req.getParameter("fname");
		out.println("welcome user "+u+" hello");
	}

}
