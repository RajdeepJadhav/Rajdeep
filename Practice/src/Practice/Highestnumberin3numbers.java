package Practice;
import java.util.Scanner;
public class Highestnumberin3numbers {

	public static void main(String[] args) {
		// Highest number from 3 numbers
		//taking input from user
		System.out.println("Please enter your first number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Please enter your second number");
		int b=sc.nextInt();
		System.out.println("Please enter your third number");
		int c=sc.nextInt();
		
		if (a>b&&a>c)
			System.out.println(+a);
		if (b>a&&b>c)
			System.out.println(+b);
		else if (c>a&&c>b)
			System.out.println(+c);
	}
			
}
