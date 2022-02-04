package Practice;

import java.util.Scanner;

public class Emp {
	int id;
	String name;
	static String cname;
	static int count;
	
	Emp()			
	{
		count++;
		id=count;
		name=" ";
	}
	Emp(String nm)
	{
		name=nm;
		count++;
		id=count;
	}
	static 
	{
		cname="axar";
		count=100;	
	}	
		public void setData()
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Please enter your name");
			String n=sc.next();
			name=n;
	}
	public void display()
	{
		System.out.println(id);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Emp e1=new Emp();
			e1.setData();
			e1.display();
			Emp e2=new Emp();
			e2.setData();
			e2.display();
			Emp e3=new Emp();
			e3.setData();
			e3.display();
	}

}
