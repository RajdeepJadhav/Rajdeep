package Practice;
/*Create Employee class which has attributes (id, name, salary, dept, mydate)
Where dept and mydate is class, dept has (dept_id, dept_name) And
mydate has (day, month, year) Display Employee information
(Note - Containment using constructor and getter/setter).
 * */

public class Employee {
	int id;
	String name;
	double sal;
	Address addr;
	Mydate dob;
	
	

	public Employee(int id, String name, double sal, Mydate dob, Address obj) {
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.addr = obj;
		this.dob = dob;
	}

	public void display() {
		System.out.println("Employee details are :");
		System.out.println("id is  " + id);
		System.out.println("name is  " + name);
		System.out.println("sal is  " + sal);
		dob.display();
		addr.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee(123, "xyz", 30000, new Mydate(4, 3, 1997),
		new Address(415002, "sambhaji nagar", "Satara"));
		e.display();
		
		Address a=new Address(45110,"pune","satara");
		Mydate d=new Mydate(9,9,2000);
		Employee e2 = new Employee(154, "ggwp", 50000, d,a);
		e2.display();
		a.setArea("asdas");
		a.setCity("satara");
		a.setPinCode(900041);
		e2.display();
		
	
		
	
		
				
				

	}

}
