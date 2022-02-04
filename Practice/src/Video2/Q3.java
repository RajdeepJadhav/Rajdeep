package Video2;

import java.util.Scanner;

//Write a Java program to input any alphabet and check whether it is vowel or consonant.
public class Q3 {
	

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			char ch=sc.next().charAt(0);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') 
			{
					System.out.println("vowel");
			}
			else
				System.out.println("consonant");
			
			

	}

}
