package com.Dao;
import java.util.List;
import java.sql.Date;

import com.Model.Student;
public interface StudentDao {
	
	boolean addStudent(Student s);
	boolean deleteStudent(int id);
	boolean updateStudent(Student s);
	List<Student>getAllStudent();
	Student getStudentById(int id);
	

}
