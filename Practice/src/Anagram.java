import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	
	public boolean isAnagram(String a,String b){	
		boolean isAnagram=false;
//		int count=0;
//		for(int i=0;i<a.length();i++) {
//			for(int j=0;j<b.length();j++) {
//				if(a.charAt(i)==(b.charAt(j))) {
//					count++;
//					break;
//				}
//		}
//		if(count==a.length()) {
//			isAnagram=true;
//		}
//		else {
//			isAnagram=false;
//		}

		char[]a1=a.toCharArray();
		char[]b1=b.toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(b1);
		for(int i=0;i<a1.length;i++) {
			if(a1.length!=b1.length) 
			{
				isAnagram=false;
			}
			else if(a1[i]!=b1[i]) {
				isAnagram=false;
				break;}
			else {
				isAnagram = true;}
		}
		return isAnagram;
		}	
	public static void main(String[] args) {
		
			Anagram ab=new Anagram();
			Scanner sc=new Scanner(System.in);
			String a=sc.nextLine();
			String b=sc.nextLine();
			
			boolean isAnagram=ab.isAnagram(a,b);
			System.out.println(isAnagram);
			
			
			
	}	

}
