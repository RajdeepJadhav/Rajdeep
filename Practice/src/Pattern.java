import java.util.HashMap;

/*Draw the below pattern -
* * * * *
* * * *
* * *
* *
*
 * */
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) 
		{
			for(int j=6-i;j>=1;j--) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	
	}

}
