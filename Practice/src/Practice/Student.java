dpackage Practice;

public class Student {
		int id;
		String name;
		
		Student(int id,String name)
		{
			this.id=id;
			this.name=name;
		}
		void display()
		{
			System.out.println(this.id);
			System.out.println(this.name);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Student s1=new Student(17,"asdas");
			s1.display();
	}

}
