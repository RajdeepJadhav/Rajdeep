package Practice;
import java.util.Scanner;
public class Oddnumbersumtilln {
		//Write a program to find sum of all odd numbers between 1 to n.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//displaying user to enter a number
		System.out.println("Please enter a number till u wanna find sum of odd numbers :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++)
			if (i%2!=0)
				sum=sum+i;
		System.out.println("Sum of odd numbers is :" +sum);
	}

}
