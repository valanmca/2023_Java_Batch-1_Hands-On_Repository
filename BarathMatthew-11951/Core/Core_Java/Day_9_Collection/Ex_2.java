package Day_9_Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex_2 {

	public static void main(String[] args) {
		HashSet<Integer> list = new HashSet<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(70);
		list.add(50);
		list.add(10);
		System.out.println(list);
//		System.out.println(list.get(3));//We can't get element in set because we can't access it using index
		list.remove(70); //remove using values
		System.out.println(list);
		
//		way -1 

//		This way won't work
		
//		for(int i =0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		
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
