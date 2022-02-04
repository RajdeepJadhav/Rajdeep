package Practice;

public class Secondlargest {

	public static void main(String[] args) {
			int sum=0;
			int avg;
			int count=0;
			int a[]= {10,20,30,40,50};
			for(int i=0;i<a.length;i++) 
			{
				sum=sum+a[i];
				count++;
			}
			avg=sum/a.length;
			System.out.println(avg);
			
	}

}
