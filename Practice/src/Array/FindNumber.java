package Array;

import java.util.Scanner;

/*Take 10 integer inputs from user and store them in an array. Again ask user
to give a number. Now, tell user whether that number is present in array or
not.
 * */
public class FindNumber {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
//				System.out.println("enter size");
//				int s=sc.nextInt();
//				int a[]=new int[s];
//				for(int i=0;i<a.length;i++) 
//				{	
//					System.out.println(" enter elements at "+(i+1)+" index ");
//					a[i]=sc.nextInt();
//					
//				}
				int b=sc.nextInt();
				int a[]= {1,2,3,4,5}; 
				for(int i=0;i<a.length;i++) 
				{
					if(a[i]==b) 
					{
						System.out.println("yes");
						break;
					}
					else
						System.out.println("no");
						break;
				}
				
	}

}
