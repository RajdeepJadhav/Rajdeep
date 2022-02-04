package practice1;

/*Write a Java program or function which takes two strings as input
 *  and print common characters between them in alphabetical order. 
For example, if "thin sticks" and "thick bricks" are two given input
 strings then common characters between them in alphabetical order are
  [c, h, i, k, s, t].

 * */
import java.util.Scanner;

public class CommonCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		String a = sc.nextLine();
		System.out.println("Enter second String");
		String b = sc.nextLine();
		int count = 0;
		for (int i = 0; i < a.length(); i++) {
			for (int j = 0; j < b.length(); j++) {
				if (a.charAt(i) == b.charAt(j)) {
					count++;
					if(count==1)
						i++;
						j++;
				}
				if (a.charAt(i) == b.charAt(j) && count == 1) {
					System.out.println(a.charAt(i));
		

				}

			}
		}

	}
}
