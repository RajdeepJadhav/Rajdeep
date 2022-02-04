
public class NestedClassEx {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a[]= {65,12,28,59,96,100};
			int l=a[0];
			int s=a[1];
			
			for(int i=2;i<a.length;i++) 
			{
				if(a[i]>=l) 
				{
					s=l;
					l=a[i];
				}
				 if(a[i]<l&&a[i]>s) 
				{
					s=a[i];
				}
			}
			System.out.println(s);
		
	}

}
