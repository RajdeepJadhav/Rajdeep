import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

// find duplicate characters in a string in java
//For example, in a string “Better Butter”, duplicate characters and their 
//count is t : 4, e : 3, r : 2 and B : 2.
public class Duplicate {

	public static void main(String[] args) {
				String a="Better Butter";
				char []b=a.toCharArray();
				ArrayList<Character>arr=new ArrayList<>();
				for(int i=0;i<b.length;i++) 
				{	
					arr.add(b[i]);
				}
				TreeMap<Character,Integer>hs=new TreeMap<>();
				Iterator<Character>itr=arr.iterator();
				while(itr.hasNext()) 
				{
					Character ch=itr.next();
					int n=Collections.frequency(arr, ch);
					hs.put(ch, n);
				}
				System.out.println(hs);
				
				

	}

}
