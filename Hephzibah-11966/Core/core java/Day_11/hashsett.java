package Day_11;

import java.util.HashSet;
import java.util.Iterator;

public class hashsett {

	public static void main(String[] args) {
		HashSet<Integer> list=new HashSet<Integer>();  //Implementing classes are : Hashset, LinkedList.
		list.add(10);
		list.add(70);
		list.add(20);
		list.add(90);
		list.add(10);     //It will not allow duplicates.
	
		System.out.println(list);
		
		list.remove(70);   //Set  is a Non-Index Based Collection.
		System.out.println(list);
				
		//Way2
		for(Integer o:list) {
			System.out.println(o);
		}
		
		//Way3
		Iterator<Integer> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
	}

}
