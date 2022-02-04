import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingToFile {
	
	public void readData(String s,String s1) {
		//FileInputStream file = null;
		//FileInputStream file1 = null;
		try(FileInputStream file =new FileInputStream(s); FileOutputStream file1 =new FileOutputStream(s1)) {
			//file = new FileInputStream(s);
			int data = file.read();
			//file1 = new FileInputStream(s1);
			//int data1 = file1.read();
			//System.out.println("Data :");
			while(data!=-1) {
				file1.write(data);
				file1.flush();
				//System.out.print((char)data);
				data = file.read();
			}
//			while(data1!=-1) {
//				System.out.print((char)data1);
//				data1 = file1.read();
//			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			System.out.println(e.getLocalizedMessage());
		}
		System.out.println("Copying Done...!");
//		finally
//		{
//			try {
//				file.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}

	}
	public void writeData(String s) {
		FileOutputStream f=null;
		try {
			f = new FileOutputStream(s);
			System.out.println("Enter Data :");
			int data;
			data = System.in.read();
			while(data!=-1) {
		
			f.write(data);
			f.flush();
			data = System.in.read();}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			System.out.println(e.getLocalizedMessage());
		}
		finally	{
			try {
				f.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Data written to file");
	}
	public void data(String s,String s1) {
		try(FileInputStream f = new FileInputStream(s);
			BufferedInputStream b = new BufferedInputStream(f);
			FileOutputStream fout = new FileOutputStream(s1);
			BufferedOutputStream bout = new BufferedOutputStream(fout);) 
		{
			int data = b.read();
			while(data!=-1)
			{
				fout.write(data);
				fout.flush();
				data=b.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Copying Done...!");
	}
	public static void main(String[] args) {
		WritingToFile w = new WritingToFile();
		w.writeData("D:\\Study Material\\Assignments");
		//w.readData("D:\\Notes\\Assignments-4\\info.txt","D:\\Notes\\Assignments-4\\copy.txt");
		w.data("D:\\Notes\\Assignments-4\\info.txt","D:\\Notes\\Assignments-4\\copy.txt");
	}

}






//(FileInputStream file =new FileInputStream(s))
