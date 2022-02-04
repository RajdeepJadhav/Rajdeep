import java.util.Arrays;
import java.util.Scanner;

public class TwoDigit {

	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				int a[]={1,2,3,5,6,7,8,11,13};
				String c=" ";
				String b=Arrays.toString(a);
				for(int i=0;i<b.length();i++) 
				{
					if(b.charAt(i+1)-b.charAt(i)==1) 
					{
						c=c+b.charAt(i);
					}
				}
				System.out.println(c);
				}

}

