package Practice;
import java.util.Scanner;
public class Dowhilecount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to find count of numbers
		//asking user to input a number
		System.out.println("Please enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=1;
		
		do {
			System.out.println(+count);
			count++;
		
		}while (count<=n);
			System.out.println(+count);
			
	}

}
