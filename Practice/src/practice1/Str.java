package practice1;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;
public class Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string");
		String a=sc.nextLine();
		System.out.println("enter second string");
		String b=sc.nextLine();
		
		TreeSet<Character>arr=new TreeSet<>();
		char[] a1=a.toCharArray();
		char[]b1=b.toCharArray();
		
		for(int i=0;i<a1.length;i++) 
		{
			if(a1[i]==' ') 
			{
				a1[i]='#';
			}
		}
		for(int i=0;i<a1.length;i++) 
		{
			for(int j=0;j<b1.length;j++) 
			{
				
				if(a1[i]==b1[j]&&a1[i]!='#') 
				{
					arr.add(a1[i]);
					a1[i]='#';
					break;
				}
			}
		}
		System.out.println(arr);

	}

}
