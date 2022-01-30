package com.Ait;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/AddStudent")
public class AddStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AddStudent() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("sname");
		int percent=Integer.parseInt(request.getParameter("percent"));
		String city=request.getParameter("city");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body bgcolor='black>");
		out.println("<h1>StudentDetails</h1>");
		out.println("<h4>"+name+"</h4><br>");
		out.println("<h4>"+percent+"</h4><br>");
		out.println("<h4>"+city+"</h4><br>");
		out.println("</body>");
		out.println("<html>");
//		RequestDispatcher rd= request.getRequestDispatcher("Add.jsp");
//		rd.forward(request, response);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crudoperation?useSSL=false","root","1daredevil")){
			PreparedStatement pt=con.prepareStatement("insert into Student(name,percent,city) values(?,?,?)");
			pt.setString(1,name);
			pt.setInt(2, percent);
			pt.setString(3, city);
			pt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		RequestDispatcher rd= request.getRequestDispatcher("Add.jsp");
		rd.forward(request, response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
	}

}
