package Array;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

/*Find out array element whose difference is least
for ex, if array is {4,6,9,12,5,7,15,18,20} then output should be 
both elements and its difference ie.(4 and 6 = 2, 5 and 7 = 2, 18 and 20 = 2)
 * */
public class LeastDifference {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int size=sc.nextInt();
//		int a[]=new int[size];
//		for(int i=0;i<a.length;i++) {
		int a[] = {13,7,4,9,12,17,3,8,1};
		int diff = 0;
		int mindiff = a[0] - a[1];
		if(mindiff<0) 
		{
			mindiff=mindiff*-1;
		}
		for (int i = 1; i < a.length; i++) {
			for (int j = i + 1; j < a.length;)
			{
				diff = a[i] - a[j];
				break;
			}
			if(diff<0) 
			{
				diff=diff*-1;
			}
			if(diff<=mindiff) 
			{
				mindiff=diff;
			}
		}
		System.out.println("minimum difference is "+mindiff);
		System.out.println();
		int m=0;
		for(int i=0;i<a.length;i++) 
		{
			for(int j=i+1;j<a.length;) 
			{
				m=a[i]-a[j];
				if(m<0) 
				{
					m=m*-1;
				}
				if(m==mindiff) 
				{
					System.out.println(a[i]+" and "+a[j]+" ="+m);	
				}
				break;
			}
			
		}

	


	}
}


