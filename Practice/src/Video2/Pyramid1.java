package Video2;

public class Pyramid1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			for(int i=1;i<=3;i++) 
//			{
//				for(int j=i;j>=i+2;j++) 
//				{
//					System.out.print("*");
//				}
//			}
			for(int i=1;i<4;i++) {
				for(int j=4-i;j>1;j--) {
					System.out.print(" ");
				}
				for(int k=0;k<i;k++) {
					System.out.print("* ");
				}
				System.out.println();
			}
	}

}
