package Array;

public class Vv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String a="Shrrikant";
			char []b=a.toCharArray();
			int count=0;
			for(int i=0;i<b.length;i++) 
			{
				for(int j=i+1;j<b.length;j++) 
				{
					if(b[i]==b[j]) 
					{
						count++;
						b[j]='#';
					}
				}
				System.out.println(b[i]+" occured "+count+" times");
			}
	}

}
