package Practice;
import java.util.Scanner;
public class Per {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter subject 1 marks");
		int a=sc.nextInt();
		System.out.println("enter subject 2 marks");
		int b=sc.nextInt();
		System.out.println("enter subject 3 marks");
		int c=sc.nextInt();
		System.out.println("enter subject 4 marks");
		int d=sc.nextInt();
		System.out.println("enter total out of marks");
		int total=sc.nextInt();
		double percentage;
		
		int sum=a+b+c+d;
		percentage=(sum/400*100);	
	}
	
	}



