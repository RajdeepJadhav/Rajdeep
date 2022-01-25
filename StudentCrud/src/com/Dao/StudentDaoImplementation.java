package com.Dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.Configuration.DBConnect;
import com.Model.Student;

public class StudentDaoImplementation implements StudentDao {

	public static final String ENTER="insert into Student(name,percent,birthdate,city) values(?,?,?,?)";
	
	public boolean addStudent(Student s) 
	{
		
		try(Connection con=DBConnect.getConnection();)
				{
					PreparedStatement pt=con.prepareStatement(ENTER);
					pt.setString(1,s.getName() );
					pt.setInt(2,s.getPercentage());
					pt.setDate(3,s.getBirthdate());
					pt.setString(4,s.getCity());
					pt.executeUpdate();
					return true;
				}catch(Exception e) 
				{
					e.printStackTrace();
				}
		return false;
	}
	
	public boolean deleteStudent(int id) {
		String del="delete from student where id="+id;
		try(Connection con=DBConnect.getConnection();)
		{
			Statement st=con.createStatement();
			st.executeUpdate(del);
			return true;
			
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
		return false;
	}

	public boolean updateStudent(Student s) {
		String st="update student set percent=? where id=?";
		try(Connection con=DBConnect.getConnection();PreparedStatement pt=con.prepareStatement(st);)
		{
			//PreparedStatement pt=con.prepareStatement(st);
			pt.setInt(1,s.getPercentage());
			pt.setInt(2,s.getId());
			pt.executeUpdate();
			return true;
			
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
		return false;
	}

	public List<Student> getAllStudent() {
		
		List<Student>li=new ArrayList<>();
		try(Connection con=DBConnect.getConnection();)
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
				li.add(s1);
			}
			return li;
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
		return null;
	}

	public Student getStudentById(int id) {
		Student stu=new Student();
		try(Connection con=DBConnect.getConnection();)
		{
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select *from student where id="+id);
			while(rs.next()) 
			{
				stu.setId(id);
				stu.setName(rs.getString(2));
				stu.setPercentage(rs.getInt(3));
				stu.setBirthdate(rs.getDate(4));
				stu.setCity(rs.getString(5));
				return stu;
			}
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
		return null;
	}

}
