//Collections for the ArrayList
import java.util.ArrayList;
import java.util.Iterator;
public class Collections_Example2 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(50);
		list.add(30);
		list.add(10);
		System.out.println(list);
		System.out.println(list.get(2)); // 50
		list.remove(3); // Remove the 30
		System.out.println(list);

		// Way - 1
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

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