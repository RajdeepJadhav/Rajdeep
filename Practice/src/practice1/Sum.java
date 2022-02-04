package practice1;

import java.util.Arrays;
import java.util.Scanner;

//input int a[]={4,5,6,4,9,1,2}; output=[4,6,9,1]
public class Sum {

	public int[] targetSumFifteen(int array[], int b) { 
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] + array[j] == b) {
					count++;
				}
			}
		}
		int a[] = new int[count*2];
		int count1 = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] + array[j] == b) {
					a[count1] = array[i];
					count1++;
					a[count1] = array[j];
					count1++;
				}
			}
		}
		
		return a;
	}

	public void display(int arr[]) {
	System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("enter sum");
				int b=sc.nextInt();
				System.out.println("enter size of array");
				int size=sc.nextInt();
				int []array=new int[size];
				System.out.println("enter elements");
				for(int i=0;i<array.length;i++) 
				{
					array[i]=sc.nextInt();
				}

		Sum s = new Sum();
				s.display(s.targetSumFifteen(array, b));

	}
}
