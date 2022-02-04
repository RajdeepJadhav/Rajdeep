package com.Ait;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class Hibernate3 {

	public static void main(String[] args) {
		
		Configuration c=new Configuration();
		c.configure("Hibernate.cfg.xml");
		SessionFactory sf=c.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction t=ss.beginTransaction();
		
//		Vehicle v1=new Vehicle(3214,"Access");
//		ss.save(v1);
//		Person p1=new Person(1231,"Rajdeep",v1);
//		ss.save(p1);
		
//		Employee e1=new Employee(1,"Rajdeep");
//		Employee e2=new Employee(2,"Omkar");
//		Employee e3=new Employee(3,"Akash");
//		Employee e4=new Employee(4,"Abhi");
//		ss.save(e1);
//		ss.save(e2);
//		ss.save(e3);
//		ss.save(e4);
//		List<Employee>list=Arrays.asList(e1,e2,e3,e4);
//		Department d1=new Department(101,"It",list);
//		
//		ss.save(d1);
//		Employee e=ss.get(Employee.class,"rajdeep");
//		System.out.println(e);
//		e.setEname("joseph");
//		t.commit();
		

		
		Query q=ss.createQuery("from Employee");
		List<Employee> li=q.list();
		for(Employee e:li) 
		{
			System.out.println(e);
		}

	}

}
