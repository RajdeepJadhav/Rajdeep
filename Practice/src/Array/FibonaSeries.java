package Array;

import java.util.Scanner;


public class FibonaSeries {

	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int n3=0;
	//	int n4=0;
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		System.out.println(n1);
		System.out.println(n2);
		for(int i=3;i<=s;i++) 
		{
			n3=n1+n2;
			System.out.println(n3);
			n2=n3;
			n1=n2;
		}
		sc.close();

	}

}
