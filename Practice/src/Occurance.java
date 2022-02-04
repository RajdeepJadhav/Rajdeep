import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Hello World";
		String []b=a.split(" ");
		Map<Integer,String>m=new HashMap<>();
		ArrayList<String>a1=new ArrayList<>();
		for(int i=0;i<b.length;i++) 
		{
			a1.add(b[i]);
		}
		
		Iterator<String>itr=a1.iterator();
		while(itr.hasNext()) 
		{
			String c=itr.next();
			int nc=Collections.frequency(a1, c);
			m.put(nc, c);
		}
		System.out.println(m);
	}
	
}
