package Practice;

import java.util.Scanner;

public class Bouncy {
	
		boolean isIncreasing(int n) 
		{
			String s=Integer.toString(n);
			char ch;
			int f=0;
			
			for(int i=0;i<s.length()-1;i++) 
			{
				ch=s.charAt(i);
				if(ch>s.charAt(i+1)) 
				{
					f=1;
					break;
				}
			}
			if(f==1) 
			{
				return false;
			}
			else
				return true;
		}
		boolean isDecreasing(int n) 
		{
			String s=Integer.toString(n);
			char ch;
			int f=0;
			
			for(int i=0;i<s.length()-1;i++) 
			{
				ch=s.charAt(i);
				if(ch<s.charAt(i+1)) 
				{
					f=1;
					break;
				}
			}
			if(f==1) 
			{
				return false;
			}
			else
				return true;
		}
		
		public void isBouncy(int n) 
		{
			if(isIncreasing(n)==true) 
			{
				System.out.println(n+" is increasing");
			}
			else if(isDecreasing(n)==false) 
			{
				System.out.println(n+" is decreasing");
			}
			else
				System.out.println(n+" is bouncy");
		}
		

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter number");
			int n=sc.nextInt();
			Bouncy b=new Bouncy();
			b.isBouncy(n);
			
		
		
		
	
		
		

	}

}
