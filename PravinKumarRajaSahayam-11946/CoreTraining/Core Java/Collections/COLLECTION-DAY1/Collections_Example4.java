//Collections for the sortedset
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Collections_Example4 {
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		TreeSet<Integer> list = new TreeSet<Integer>(Collections.reverseOrder());
		list.add(10);
		list.add(20);
		list.add(50);
		list.add(30);
		list.add(10);
		System.out.println(list);
		list.remove(30); // Remove the 30
		System.out.println(list);

		// Way - 2
		for (Integer o : list) {
			System.out.println(o);
		}

		// Way - 3
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}