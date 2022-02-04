package Practice;

public class Mydate {
	int dd,mm,yy;
	public Mydate() {}
	public Mydate(int dd,int mm,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
		
	}
	
	
	public int getDd() {
		return dd;
	}
	public void setDd(int dd) {
		this.dd = dd;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getYy() {
		return yy;
	}
	public void setYy(int yy) {
		this.yy = yy;
	}
	public void display() 
	{
		System.out.println(dd+"/"+mm+"/"+yy);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Mydate obj=new Mydate();
			obj.display();
			Mydate obj1=new Mydate(4,3,1997);
			obj1.display();
			
	}

}
