package Practice;

import java.util.Scanner;

public class Occu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter here");
		String n = sc.nextLine();
		char c[] = n.toCharArray();
		String a1="";
		String b1="";
		String c1="";
		for(int i=0;i<c.length;i++) 
		{
			if(c[i]==' ') 
			{
				a1=a1+c[i];
				continue;
			}
	
		}
		System.out.println(a1);

	}

}
