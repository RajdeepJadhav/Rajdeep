package Practice;
import java.util.Scanner;
public class Forsumofallebennumbers {
		// Write a program to find sum of all even numbers between 1 to n. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//asking user to input a number
		System.out.println("Please enter a number till u wanna find sum of even numbers");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for (int i=1;i<=n;i++)
		
			if (i%2==0)
				sum=sum+i;
			System.out.println( "Sum of even numbers are :" +sum);
		}
	}


