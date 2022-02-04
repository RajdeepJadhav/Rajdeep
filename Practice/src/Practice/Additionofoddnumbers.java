package Practice;

import java.util.Scanner;

public class Additionofoddnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// asking user to input anumber
		System.out.println("Enter a number till u wanna find odd numbers");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= n; i++) {

			if (i % 2 != 0)
				sum = sum + i;
			}
		System.out.println(+sum);
	}

}
