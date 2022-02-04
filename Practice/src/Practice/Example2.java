package Practice;

import java.util.ArrayList;

public class Example2 {
	ArrayList<Integer> l1 = new ArrayList<Integer>();
	ArrayList<Integer> l2 = new ArrayList<Integer>();
	ArrayList<Integer> l3 = new ArrayList<Integer>();

	public void createList() {
		l1.add(5);
		l1.add(6);
		l1.add(8);
		l1.add(2);
		l1.add(4);
		l1.add(2);
		l1.add(3);

		l2.add(6);
		l2.add(3);
		l2.add(9);
		l2.add(0);
		l2.add(2);
		l2.add(3);
		l2.add(2);
		l2.add(1);
		l2.add(6);
		l2.add(7);
	}

	public void display() {
		System.out.println("arraylist l1:");
		for (int i = 0; i < l1.size(); i++) {
			System.out.print(l1.get(i) + " ");
		}
		System.out.println();
		System.out.println("arraylist l2:");

		for (int i = 0; i < l2.size(); i++) {
			System.out.print(l2.get(i) + " ");
		}
		System.out.println();
	}

	public void createListl3() {
		System.out.println("after printing alternate elements:");

		for (int i = 0; i < l1.size(); i++) {
			if (i % 2 == 0) {

				l3.add(l1.get(i));
			} else if(i%2!=0){

				l3.add(l2.get(i));
			}
			 
			
		}

		for (int i = 0; i < l1.size(); i++) {
			if(l1.size()!=l2.size()&&i%2!=0) 
			{
				l3.add(l1.get(i));
			}
			
			}
			System.out.println(l3);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example2 e = new Example2();
		e.createList();
		e.display();
		e.createListl3();
	}
}



