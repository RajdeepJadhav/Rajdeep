package Practice;

/*A number is said to be the Harshad number if it is divisible by the sum 
 * of its digit.For example, if number is 156, then sum of its digit
 *  will be 1 + 5 + 6 = . Since156 is divisible by 12. 
 *  So, 156 is a Harshad number.

 * */
import java.util.Scanner;

public class Harshad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number here");
		int n = sc.nextInt();
		int sum = 0;
		int p = n;
		int digit = 0;
		while (n > 0) {
			digit = n % 10;
			sum = sum + digit;
			n = n / 10;
		}

		if (p % sum == 0) {
			System.out.println("harshard number");
		} else
			System.out.println("not harshad");
	}

}
