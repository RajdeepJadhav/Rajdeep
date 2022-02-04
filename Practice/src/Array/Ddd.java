package Array;

public class Ddd {
		
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60};
		int n=a.length/2;
		for(int i=0;i<a.length;i++) {
			if(i<n) {
				System.out.println(a[n+i]);}
			else if(i>=n){
				System.out.println(a[i-n]);}
		}
		

	}

}
