package practice1;

public class Stringsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String a="raj15987deep";
			int sum=0;
			int c;
			for(int i=0;i<a.length();i++) 
			{
				if(a.charAt(i)>='0'&&a.charAt(i)<='9') 
				{
					sum=sum+Character.getNumericValue(a.charAt(i));
				}
			}
	}

}
