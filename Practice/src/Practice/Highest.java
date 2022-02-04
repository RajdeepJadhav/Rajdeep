package Practice;

import java.util.Scanner;

public class Highest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st digit");
		int a=sc.nextInt();
		System.out.println("enter 2nd digit");
		int b=sc.nextInt();
		System.out.println("enter 3rd digit");
		int c=sc.nextInt();
		
		if(a>b&&a>c) 
		{
			System.out.println(a);
		}
		else if(b>a&&b>c) 
		{
			System.out.println(b);
		}
		else
			System.out.println(c);
	}

}
