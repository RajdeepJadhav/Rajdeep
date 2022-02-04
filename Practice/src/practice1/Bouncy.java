package practice1;

import java.util.Scanner;

public class Bouncy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("enter");
			String a=sc.next();
			System.out.println("given number is");
			int b=a.length()/2;
			int count=0,count1=0;
			for(int i=0;i<a.length();i=i+2) 
			{
				for(int j=i+1;j<a.length();j=j+2) 
				{
					if(a.charAt(i)>a.charAt(j)) 
					{
						count++;
						break;
					}
					else if(a.charAt(i)<a.charAt(j)) 
					{
						count1++;
						break;
					}
				}
				
			}
			if(b==count1) 
			{
				System.out.println("increasing");
			}
			else if(b==count) 
			{
				System.out.println("decreasing");
			}
			else
				System.out.println("bouncy");
			
			
			
	}

}
