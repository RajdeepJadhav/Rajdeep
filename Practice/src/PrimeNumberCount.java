import java.util.Scanner;

public class PrimeNumberCount {

	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("enter first number");
				int first=sc.nextInt();
				System.out.println("enter second number");
				int second=sc.nextInt();
				int count=0;
				int c=0;
				for(int i=first;i<=second;i++) 
				{	
					for(int j=1;j<=i;j++) 
					{				
						if(i%j==0) 
						{
							count++;
						}
					}
					if(count<=2){
						c++;
						System.out.print(i+" ");
					}
					count=0;
				}
				System.out.println("\nCount of prime numbers :"+c);
				
				

	}

}
