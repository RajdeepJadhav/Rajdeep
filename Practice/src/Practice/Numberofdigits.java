package Practice;
import java.util.Scanner;
public class Numberofdigits {
		// Write a program to count number of digits in any number
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//asking user to input a digit
		int count=1;
		System.out.println("Please enter a digit");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=n;
		
		 do{
		
			n=n%10;
			n=a;
			count++;
		}while(n>0);
		System.out.println(+count);
	}

}
