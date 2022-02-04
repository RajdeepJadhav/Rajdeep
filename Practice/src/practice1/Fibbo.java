package practice1;

import java.util.Scanner;

public class Fibbo {

	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("enter number here");
				int a=sc.nextInt();
				int sum=1;
				int n1=40;
				int n2=50;
				int n3=0;
				
				for(int i=40;i<=50;i++) 
				{
					n3=n1+n2;
					n1=n2;
					n2=n3;
					System.out.println(n3);
				}
	
			
	}

}
