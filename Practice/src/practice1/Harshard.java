package practice1;
/*A number is said to be the Harshad number
 *  if it is divisible by the sum of    
 *    its digit.For example, if number is 156, 
 *  then sum of its digit will be 1 + 5 + 6 = .
 *   Since156 is divisible by 12. So, 156 is a Harshad number.

 * */
import java.util.Scanner;
public class Harshard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("enter number to find if it's harshad or not");
			int a=sc.nextInt();
			int sum=0;
			int digit=0;
			int p=a;
			while(a>0) 
			{
				digit=a%10;
				sum=sum+digit;
				a=a/10;
			}
			if(p%sum==0) 
			{
				System.out.println("given number is harshad number");
			}
			else
				System.out.println("it's not");
	}

}
