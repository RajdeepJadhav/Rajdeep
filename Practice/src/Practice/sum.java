package Practice;
import java.util.Scanner;
public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	
		int size=5;
		int a[]=new int[size];
		int sum=0;
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++) 
		{
			 sum=sum+a[i];
		}
		int avg=sum/size;
		System.out.println(sum);
		System.out.println(avg);
		
	}

}
