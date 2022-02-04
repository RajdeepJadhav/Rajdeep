package Practice;
import java.util.Scanner;
public class Whileloopcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//count numbers till user input
		//taking input from user
		System.out.println("Please enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count;
		count =1;
		
		while (count<=n) 
		{
			System.out.println(+count);
			count++;
		}
		System.out.println( );
	}

}
