package Video2;

import java.util.Scanner;

public class FibboSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number upto which u want to find series");
		int n=sc.nextInt();
		int n1=0;
		int n2=1;
		int n3;
		for(int i=3;i<n;i++) 
		{
			
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			
		}
		
	}

}
