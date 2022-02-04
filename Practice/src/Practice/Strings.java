package Practice;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String s[]= {"HellO","GOOd","Think","Maths"};
		char b[]= {};
		int c=0;
		for(int i=0;i<s.length;i++) 
		{
			if(i==c) 
			{
				for(int j=0;j<s[i].length();j++) 
				{
					System.out.println(s[i].charAt(c));
					c++;
				}
			}
		}
		
	}
}
