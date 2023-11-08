package Day_9_Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex_1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(70);
		list.add(50);
		list.add(10);
		System.out.println(list);
		System.out.println(list.get(3));
		list.remove(3);
		System.out.println(list);
		
//		way -1 
		
		for(int i =0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
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
