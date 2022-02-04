package Video2;

import java.util.Arrays;

public class Outer {
	
		private int data=10;
		
		class Inner{
			
			private int data=20;
			private int getData() 
			{
				return data;
			}
			
			public void main(String []args) 
			{
				Inner in=new Inner();
				System.out.println(in.getData());
			}
		}
		private int getData() 
		{
			return data;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o=new Outer();
		Outer.Inner in=o.new Inner();
		System.out.printf("%d",o.getData());
		in.main(args);
	
			
			
	
	
	}

}
