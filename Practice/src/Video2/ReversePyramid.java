package Video2;

//take number from user and 
import java.util.Scanner;

public class ReversePyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int r = 1;
		int sum = 0;
		int count = 0;
		int b = a;

		while (a > 0) {
			a = a / 10;
			count++;

		}
		
		for(int i=b;i>0;i=i/10) 
		{
			int rem=i%10;
			for(int j=1;j<count;j++) 
			{
				r=r*rem;
			}
			b=b/10;
			sum=sum+r;
			
		}
		System.out.println(r);
	}


}
