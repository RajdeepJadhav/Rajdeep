package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;

import java.util.Iterator;

public class CountOfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String a="Shrikant";
			char [] b=a.toCharArray();
			ArrayList<Character>arr=new ArrayList<>();
			for(int i=0;i<b.length;i++) 
			{
				arr.add(b[i]);
			}
			int count=0;
			LinkedHashMap<Character,Integer>lk=new LinkedHashMap<>();
			
			Iterator<Character>itr=arr.iterator();
			while(itr.hasNext()) 
			{
				Character ch=itr.next();
				count=Collections.frequency(arr, ch);
				lk.put(ch, count);
			}
			System.out.print(lk);
			
	}

}
