package Day_9_Collection;

import java.util.TreeSet;
import java.util.Collections;
import java.util.Iterator;

public class Ex_3 {

	public static void main(String[] args) {
		
//		
		
		TreeSet<Integer> list = new TreeSet<Integer>(Collections.reverseOrder());
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(70);
		list.add(50);
		list.add(10);
		System.out.println(list);
//		System.out.println(list.get(3));
		list.remove(70);
		System.out.println(list);
		
		
//		way-2
		
		for(Integer o : list) {
			System.out.println(o);
		}
		
//		way-3
		
		Iterator<Integer> it =  list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
