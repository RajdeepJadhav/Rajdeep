package Practice;

public class ObjectCount {

	public static void main(String[] args) {
		int count=0;
		
		try {
			ObjectCount o=new ObjectCount();
			ObjectCount o1=new ObjectCount();
			count++;
		}catch(Exception e) {
				System.out.println(count);
		}

	}

}
