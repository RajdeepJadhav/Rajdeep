package Practice;

public class Address {
	int pincode;
	String area, city;

	public Address() {
	}

	public Address(int p, String a, String c) {
		this.pincode = p;
		this.area = a;
		this.city = c;
	}

	public void display() {
		System.out.println("Pincode is " + pincode + " area is " + area + "city is " + city);
	}
	
	public void setPinCode(int p)
	{
		this.pincode=p;
	}
	public void setArea(String a)
	{
		this.area=a;
	}
	public void setCity(String c)
	{
		this.city=c;
	}
	public int getPinCode()
	{
		return pincode;
	}
	public String getArea()
	{
		return area;
	}
	public String getCity()
	{
		return city;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address obj = new Address();
		obj.display();
		Address obj2 = new Address(415002, "Sambhaji nagar ", " Satara ");
		obj2.display();
		Address b1=new Address();
		b1.setPinCode(4415002);
		b1.setArea("Satara");
		b1.setCity("Satara");
		System.out.println(b1.getArea());
		System.out.println(b1.getCity());
		System.out.println(b1.getPinCode());
		
		
	}

}
