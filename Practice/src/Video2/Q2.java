package Video2;

import java.util.Scanner;

//Write a java program to find sum of digits in any number. e.g. number is 435 sum is 12
public class Q2 {	
		public int sumOfDigits(int a) {
			
			int rem=0;
			int sum=0;
			
			while(a>0) {
				rem=a%10;
				sum=sum+rem;
				a=a/10;
			}
			return sum;
		}
	public static void main(String[] args) {
			Q2 q=new Q2();
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			
			int result=q.sumOfDigits(a);
			System.out.println(result);
	}
			
}

