package Array;

import java.util.Scanner;

////0,1,1,2,4,7,13,24,...
public class TribonacciSeries {

	public static void main(String[] args) {
			int n1=0;
			int n2=1;
			int n3=1;
			int n4=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter");
			int s=sc.nextInt();
			System.out.println(n1);
			System.out.println(n2);
			for(int i=3;i<=s;i++) 
			{
				n4=n1+n2+n3;
				System.out.println(n3);
				n1=n2;
				n2=n3;
				n3=n4;
			}

	}

}
