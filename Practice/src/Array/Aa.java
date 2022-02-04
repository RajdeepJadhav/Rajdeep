package Array;

public class Aa {

	public static void main(String[] args) {
			int a=5;
			int b=7;
			int sum=0;
			
			for(int i=a;i<=b;i++) 
			{
				for(int j=0;j<=1;j++) 
				{		
					if(i%2!=0) 
					{
						sum=sum+i+1;
					}
					else if(i%2==0) 
					{
						sum=sum+i+1;
						break;
					}
				}
			}
			
			System.out.println(sum);
	}
}
