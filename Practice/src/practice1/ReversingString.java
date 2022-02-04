package practice1;
//Reverse a string preserving space positions
import java.util.Scanner;
public class ReversingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String a=sc.nextLine();
		char ch[]=a.toCharArray();
		System.out.println("after reversing string");
		for(int i=ch.length-1;i>=0;i--) 
		{
			System.out.print(ch[i]);
		}
		
	}

}
