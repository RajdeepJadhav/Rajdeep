package Practice;

public class Static {
	
	static String na;
	static int i;
	
	static
	{
		na="hello";
		                       
	}
	static 
	{
		i=20;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Static s1=new Static();
			System.out.println("name is "+na+"int is"+i);
			

	}

}
