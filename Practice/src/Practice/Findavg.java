package Practice;
import java.util.Scanner;
public class Findavg {

	public static void main(String[] args) {
		int sum=0;
		// TODO Auto-generated method stub
		Scanner as=new Scanner(System.in);
		System.out.println("enter size of array");
		int s=as.nextInt();
		int a[]=new int[s];
		for(int i=0;i<a.length;i++) 
		{
			a[i]=as.nextInt();
			sum=sum+a[i];
		}
			int avg=sum/a.length;
			System.out.println(+avg);
		}
		

}
