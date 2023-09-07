package DataStructureDay2;

import java.util.Scanner;

import java.util.LinkedList;


public class EvenOdd {

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<Integer> ();
		LinkedList<Integer> list2 = new LinkedList<Integer> ();
		LinkedList<Integer> list3 = new LinkedList<Integer> ();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 10 num");
		for(int i=0; i<=10; i++)
		{
			int n = sc.nextInt();
			list1.add(n);	
		}
		System.out.println("list is" +list1);
		
		for(int i=0;i<list1.size(); i++)
		{
			if(list1.get(i)%2==0)
					{
				    list2.add(list1.get(i));
					}
			else
			{
				list3.add(list1.get(i));
			}
		}
		sc.close();
			System.out.println("even numbers are" +list2);
			System.out.println("odd numbers are" +list3);
		
	}

}
