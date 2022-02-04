package Practice;

import java.util.Scanner;

 class B1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
			int count=0;
			int count1=0;
			int l=str.length()-1;
			for(int i=0;i<str.length();i++) 
			{
				for(int j=i+1;j<str.length();j++) 
				{	
					
					if(str.charAt(i)<str.charAt(j)) {
						count++;
						break;
					}
					else if(str.charAt(i)>str.charAt(j)) {
						count1++;
						break;
					}
				}
			}
			if(count==l) 
			{
				System.out.println("increasing");
			}
			else if(count1==l) 
			{
				System.out.println("decreasing");
			}
			else
				System.out.println("bouncy");
//			char digit;
//			
//			for(int i=0;i<str.length()-1;i++) 
//			{	
//				
//				digit=str.charAt(i);
//				if(digit>str.charAt(i+1)) 
//				{	
//					count++;	
//				}
//				else if(digit<str.charAt(i)) 
//				{
//					count1++;
//					
//				}
//				
//			}
//			str=" ";
//			if(count==l) 
//			{
//				str="decreasing";
//			}
//			else if(count1==l) 
//			{
//				str="increasing";
//			}
//			else
//				str="bouncy";
//			System.out.println(str);
//			
//		
}
}