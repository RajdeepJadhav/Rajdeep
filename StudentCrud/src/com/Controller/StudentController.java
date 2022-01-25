package com.Controller;

import java.util.List;
import java.util.Scanner;

import com.Dao.StudentDao;
import com.Dao.StudentDaoImplementation;
import com.Model.Student;
import java.sql.Date;

public class StudentController {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StudentDao ss=new StudentDaoImplementation();
		
		System.out.println("****************Welcome user**************************");
		char ch='y';
		do {
			System.out.println("1-Add new Student Data \n2-Delete Existing Student Data\n3-Update Current Student Data\n4-View All Student Data\n5-Diplay Student by id");
			int choice=sc.nextInt();
			switch(choice) 
			{
			case 1:System.out.println("--Insert New Student");
					System.out.println("Enter name");
					String name=sc.next();
					System.out.println("Enter percentage");
					int per=sc.nextInt();
					System.out.println("Enter Birth Date (y/m/d)");
					String dob=sc.next();
					Date bd=Date.valueOf(dob);
					System.out.println("Enter City Name");
					String city=sc.next();
					Student s1=new Student(name,per,bd,city);
					boolean isinsert=ss.addStudent(s1);
					if(isinsert) 
					{
						System.out.println("record inserted successfully");
					}
					else
						System.out.println("insertion failed");
					break;
			case 2:System.out.println("Delete student by id");
					System.out.println("enter id");
					int ids=sc.nextInt();
					boolean isdelete=ss.deleteStudent(ids);
					if(isdelete) 
					{
						System.out.println("record deleted successfully");
					}
					else
						System.out.println("deletion failed");
					break;
			case 3:System.out.println("update current student data");
					System.out.println("Enter id");
					int id=sc.nextInt();
					List<Student>list=ss.getAllStudent();
					for(Student stt:list) 
					{
						if(id==stt.getId()) 
						{
							System.out.println("Enter percentage you want to update");
							int pr=sc.nextInt();
							Student sm=new Student(id,pr);
							boolean boo=ss.updateStudent(sm);
							if(boo) 
							{
								System.out.println("updated successfully");
							}
							else
								System.out.println("updation failed");
						}
						else
							System.out.println("this id student is not present in database");
							break;
					}
					break;
			case 4:System.out.println("View All student data");
					List<Student>li=ss.getAllStudent();
					for(Student s:li) 
					{
						System.out.println(s);
					}
					break;
			case 5:System.out.println("Get student by id");
					System.out.println("enter student id");
					int n=sc.nextInt();
					Student s3=ss.getStudentById(n);
					System.out.println(s3);
					break;
						
			}
			System.out.println("do u want to continue y/n");
			ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');

		
		
		

	}

}
