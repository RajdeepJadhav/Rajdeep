package Array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Read {
	
	public void readDataFromFile(String s) 
	{
		FileInputStream f=null;
		try {
			f=new FileInputStream(s);
			int d=f.read();
			System.out.println(d);
			while(d!=-1) 
			{
				System.out.println((char)d);
				d=f.read();
			}
			catch(FileNotFoundException e) 
			{
				e.printStackTrace();
			}
			catch(IOException e) 
			{
				e.printStackTrace();
			}
			finally {
				try {
					f.close();
					
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
}



	public static void main(String[] args) {
			String s="b";
			
	}

}
