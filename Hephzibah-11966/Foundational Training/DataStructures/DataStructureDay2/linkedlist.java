package DataStructureDay2;

import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);
		
		list.add(1, 50);
		System.out.println("adding one element in 1st index" +list);
		
		list.set(1,100);
		System.out.println("Updating the element in 1st index is :" +list);
		
		list.remove(1);
		System.out.println("After removing element in 1st index is :" +list);
		
		System.out.println("The Size of the List is :" + list.size());
		
		System.out.println("Finall List is :" );
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
