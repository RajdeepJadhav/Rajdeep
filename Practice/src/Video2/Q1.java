package Video2;

import java.util.Scanner;

//Write a java program to find maximum number from given 3 numbers.
public class Q1 {
			
		public int maximumNumber(int a,int b,int c) 
		{
			int max=0;
			
			if(a>b&&a>c) 
			{
				max=a;
			}
			else if(b>a&&b>c) {
				max=b;
			}
			else if(c>a&&c>b) {
				max=c;
			}
			return max;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("enter first number");
			int a=sc.nextInt();
			System.out.println("enter second number");
			int b=sc.nextInt();
			System.out.println("enter third number");
			int c=sc.nextInt();
			
			Q1 q=new Q1();
			q.maximumNumber(a, b, c);
			int max=q.maximumNumber(a, b, c);
			System.out.println(max);
	}

}
