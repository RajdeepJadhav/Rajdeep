package Video2;

import java.util.Scanner;

/*WAP to check no is Krishnamurthy or not (Using while loop)
i.e. 153 = 1! + 5! + 3! = 153
 * */
public class Krishnamurthy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter");
		int a = sc.nextInt();
		int p = a;
		int sum = 1;
		int result = 0;
		int rem = 0;
		
		
//		while (a > 0) 
//		{
//			rem = a % 10;
//			a = a / 10;
			for(int j=a;j>0;j=j/10) {
				rem=j%10;

			for (int i = 1; i <= rem; i++) 
				
			{
				sum = sum * i;
			}
			result = result + sum;
			sum = 1;
		}
		if (result == p) {
			System.out.println("Number is krishnamurty");
		} else
			System.out.println("number is not krishnamurty");

	}
}
