import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your previous password");
		String pwd1 =sc.nextLine();
		pwd1.trim();
		System.out.println("Enter your current password");
		String pwd2 =sc.nextLine();
		pwd2.trim();
		char ch[] = pwd1.toCharArray();
		char ch1[] = pwd2.toCharArray();
		for (int i = 0; i < ch1.length; i++) 
		{
			for (int j = 0; j < ch.length; j++)
			{
				if (ch1[i] == ch[j]) 
				{
					ch[j] = '#';
				}
			}
		}
		System.out.println("Recommended password");
		for(int i=0;i<ch.length;i++) 
		{
			if(ch[i]!='#') 
			{
				System.out.print(ch[i]);
	
			}
		}
		

	}

}
