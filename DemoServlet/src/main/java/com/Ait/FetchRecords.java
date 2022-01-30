package com.Ait;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FetchRecords")
public class FetchRecords extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public FetchRecords() {
        super();
     
    }
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{		
				ArrayList<Student>arr=new ArrayList<>();
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crudoperation?useSSL=false","root","1daredevil"))
				{	
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select*from student");
					while(rs.next()) 
					{
						Student s1=new Student();
						s1.setId(rs.getInt(1));
						s1.setName(rs.getString(2));
						s1.setPercentage(rs.getInt(3));
						s1.setBirthdate(rs.getDate(4));
						s1.setCity(rs.getString(5));
						arr.add(s1);
					}
					
				}catch(Exception e) 
				{
					e.printStackTrace();
				}
				request.setAttribute("Details", arr);	
				PrintWriter out=response.getWriter();
				String uname=request.getParameter("fname");
				String pass=request.getParameter("pass");
				if(uname.equalsIgnoreCase("Admin")&&pass.equalsIgnoreCase("1234")) 
				{
					RequestDispatcher rd=request.getRequestDispatcher("StudentData");
					rd.forward(request, response);			
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
		doGet(request, response);
	}

}
