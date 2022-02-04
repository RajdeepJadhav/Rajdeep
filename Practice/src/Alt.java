import java.util.Arrays;

public class Alt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a[]= {45,78,3,4,2,0,13,14,17};
			int b[]=new int[a.length];
			for(int i=0;i<a.length;i++) 
			{
				for(int j=i;j<b.length;j++) 
				{
					if(a[i]%2!=0&&j%2==0) 
					{
						b[j]=a[i];
						break;
					}
					else if(a[i]%2!=0&&j%2!=0) 
					{
						b[j+1]=a[i];
					}
//					else if(a[i]%2==0&&j%2!=0) 
//					{
//						b[j]=a[i];
//					}
//					else if(a[i]%2==0&&j%2!=0) 
//					{
//						b[j]=a[i];
//					}
//					else if(a[i]%2==0&&j%2!=0) 
//					{
//						b[j]=a[i];
//					}
//					else if(a[i]%2==0&&j%2!=0) 
//					{
//						b[j]=a[i];
//					}
////					
						
				
				}
			}
			System.out.println(Arrays.toString(a));
			System.out.println(Arrays.toString(b));
	}

}
