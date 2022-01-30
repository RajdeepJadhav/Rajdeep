package com.Ait;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.function.Consumer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentData
 */
@WebServlet("/StudentData")
public class StudentData extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public StudentData() {
        super();
  
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{	
		PrintWriter pt=response.getWriter();
		ArrayList<Student>ab=(ArrayList)request.getAttribute("Details");
//		Iterator<Student>itr=ab.iterator();
//		while(itr.hasNext()) 
//		{
//			Student s=itr.next();
//			int id=s.getId();
//			String name=s.getName();
//			int percent=s.getPercentage();
//			Date d=s.getBirthdate();
//			String city=s.getCity();
//			pt.print("\tId is "+id+"\nName of student is "+name+"\tPercentage obtained "+percent
//					+"\tDate of birth "+d+"\tCity is "+city+"\t");
//			pt.println();
//		}
		
		pt.println(ab);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
