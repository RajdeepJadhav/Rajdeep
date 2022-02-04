package Practice;

public class Variblearg {
		
	public static int add(int ...p) 
	{
		System.out.println("int ...p");
		int sum=0;
		for(int i=0;i<p.length;i++)
			sum=sum+p[i];
		return sum;
	}
	public static int add(int i,int j)
	{
		System.out.println("int ,int");
		return i+j;
	}
	public static int add(int i,int j, int k)
	{
		System.out.println("int ,int,int");
		return i+j+k;
	}
	public static double add(double d,double q)
	{
		System.out.println("double,double");
		return d+q;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(1,1));
		System.out.println(add(1,1,1));
		System.out.println(add(1.2,1.4));
		System.out.println(add(1.2f,1.4f));
	}

}
