package Practice;
import java.util.Scanner;
public class Noofdays {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter which day u want to find");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		switch(n){
		
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("sunday");
			break;
			
		default:
			System.out.println("Invalid input");
			
		}
	}
}
