package Array;
import java.io.File;
public class Filedisc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				File f=new File("D:\\Study Material\\Assignments\\pdf\\xyz");
				System.out.println("is file "+f.isFile());
				System.out.println("name is "+f.getName());
				System.out.println("length of file is "+f.length());
				//System.out.println(f.renameTo(new File("D:\\Study Material\\Assignments practice")));
				String a[]=f.list();
				for(String b:a) 
				{
					File f1=new File(b);
					System.out.println(f1.isDirectory());
				}
				
	}

}
