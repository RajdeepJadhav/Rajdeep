package Practice;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a[]= {1,2,3,4,5};
			int n=5;
			int sum=0;
			
			for(int i=0;i<a.length;i++) 
			{
				for(int j=1;j<a.length;j++) 
				{
					 sum=a[i]+a[j];
					 if(sum==n) 
					 {
						 System.out.println(a[i]+"+"+a[j]);
					 }
				}
				
			}
	}

}
