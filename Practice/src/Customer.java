import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class Customer {
	int custid;
	String custname;
	int mobile;
	
	Customer(){}
	
	Customer(int custid,String custname,int mobile)
	{
		this.custid=custid;
		this.custname=custname;
		this.mobile=mobile;
	}
	
	public String toString() 
	{
		return "\ncustomer id is="+custid+"\ncustomer name is"+custname+"\ncustomer mobile number is"+mobile;
	}
	
	public ArrayList<Customer> createList() 
	{
		ArrayList<Customer>t=new ArrayList<>();
		t.add(new Customer(1101,"rajdeep",9667432));
		t.add(new Customer(11,"omkar",645765756));
		t.add(new Customer(9,"nikhil",3423242));
		t.add(new Customer(15,"abhishek",75675632));
		t.add(new Customer(1101,"rajdeep",9667432));
		t.add(new Customer(1101,"rajdeep",9667432));
		return t;
	}
	
	public boolean equals(Object o) 
	{	
		Customer c=(Customer)o;
		if(this.custid==c.custid&&this.custname.equals(c.custname)&&this.mobile==c.mobile) 
		{
			return true;
		}
		else
			return false;
	}
	
	public int hashCode() 
	{
		int rem=0;
		rem=custid+custname.hashCode()+mobile;
		return rem;
	}
	public void countOccurance(ArrayList<Customer>t) 
	{
		int count=0;
		LinkedHashMap<Customer,Integer>hs=new LinkedHashMap<>();
		Iterator<Customer>itr=t.iterator();
		while(itr.hasNext()) 
		{
			Customer c=itr.next();
			int b=Collections.frequency(t, c);
			hs.put(c, b);
		}
		Set<Entry<Customer,Integer>>en=hs.entrySet();
		Iterator<Entry<Customer,Integer>>itr2=en.iterator();
		
//		for(int i=0;i<t.size();i++) 
//		{
//			for(int j=i+1;j<t.size();j++) 
//			{
//				if(t.get(i).hashCode()==t.get(j).hashCode()) 
//				{
//					count++;
//				}
//			}
//		}
		
	}

	public static void main(String[] args) {
				Customer c=new Customer();
				c.countOccurance(c.createList());

	}

}
