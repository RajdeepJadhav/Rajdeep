package Practice;
import java.util.Scanner;
public class Sumofdigitsinanumber {
		//sum of digits in a number
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d;
		int sum=0;
		if(n>0) {
			d=n%10;
			sum=sum+d;
			
		}
			System.out.println(sum);
			n=n/10;
		}
	}


