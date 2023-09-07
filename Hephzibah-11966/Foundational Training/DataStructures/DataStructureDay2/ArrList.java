package DataStructureDay2;

import java.util.ArrayList;

public class ArrList {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		System.out.println("Size of the List: " +list.size());
		System.out.println("list:" +list);
		
		list.add(10);
		System.out.println("after adding 1 array:");
		System.out.println("list is:" +list);
		System.out.println("size is" +list.size());
		
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println("after adding elements in list" +list );
		
		list.remove(2);
		System.out.println(list );
		list.add(1,50);
		
		System.out.println(list );

	}

}
