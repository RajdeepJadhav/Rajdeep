package com.Session;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Hibernate1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration c=new Configuration();
		c.configure();
		//SessionFactory sf=c.buildSessionFactory();
		//Session ss=sf.openSession();
		//Transaction t=ss.beginTransaction();
//		Student2 s1=new Student2();
//		s1.setId(15);
//		s1.setName("jane");
//		s1.setPercent(73);
//		ss.save(s1);
	//	t.commit();
	}

}
