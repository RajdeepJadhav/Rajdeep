
public class Highetsnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n=6549;
			int max=0;
			while(n>0)
			{
				int rem=n%10;
				if(max<rem) 
				{
					max=rem;
				
				}
				n=n/10;
			}
			System.out.println(max);
			
	}

}
