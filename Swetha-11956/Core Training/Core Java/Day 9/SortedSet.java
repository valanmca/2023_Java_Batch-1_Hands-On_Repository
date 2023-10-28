//Sorted set collection---> It displays in ascending order
package JavaCollect9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Collections;

public class SortedSet {

	public static void main(String[] args) {
		
		TreeSet<Integer> list=new TreeSet<Integer>(Collections.reverseOrder());  //Autoboxing, 10 is considered as object.
		list.add(10);
		list.add(20);
		list.add(50);
		list.add(30);
		list.add(10);
		
		System.out.println(list);
		
		list.remove(50); //50 is considered as value, it is not index based.
		System.out.println(list);
		
		System.out.println("Iterating sortedset collection...Way - 1  ");
		//Way - 1
		for(Integer o:list) {
			System.out.println(o);
		}
		
		System.out.println("Iterating sortedset collection...Way - 2  ");
		
		//Way - 2
		Iterator<Integer> it= list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
