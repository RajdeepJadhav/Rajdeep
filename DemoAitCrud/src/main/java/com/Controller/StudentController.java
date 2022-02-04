package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.StudentDao;
import com.Dao.StudentDaoImplementation;
import com.Model.Student;

@WebServlet("/")
public class StudentController extends HttpServlet {
		StudentDao s=new StudentDaoImplementation();
	
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException 
	{		
				System.out.println(req.getServletPath());
				PrintWriter pt=resp.getWriter();
				String op=req.getServletPath();
				switch(op) {
				case"/delete": int id=Integer.parseInt(req.getParameter("id"));
								s.deleteStudent(id);
								resp.sendRedirect("lst");	
								break;
								
				case"/edit":	id=Integer.parseInt(req.getParameter("id"));
								Student sobj=s.getStudentById(id);
								req.setAttribute("sb",sobj);
								RequestDispatcher rd=req.getRequestDispatcher("edit.jsp");
								rd.forward(req, resp);
								break;
				
				case"/save": id=Integer.parseInt(req.getParameter("id"));
							 String nm = req.getParameter("name");
							 int percent=Integer.parseInt(req.getParameter("percent"));
							 String city=req.getParameter("city");
							 Student s1 = new Student(id,nm,percent,city);
							 s.updateStudent(s1);
							 resp.sendRedirect("lst");
							 break;
								
				default:
						List<Student>li=s.getAllStudent();
						req.setAttribute("studlist", li);
						rd=req.getRequestDispatcher("view.jsp");
						pt.println(li);  
						rd.forward(req, resp);
				}
			}
			
	

	public static void main(String[] args) {
		
		
	}

}
