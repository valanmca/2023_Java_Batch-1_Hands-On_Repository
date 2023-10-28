//List collection
package JavaCollect9;
import java.util.ArrayList;
import java.util.Iterator;

public class ListCollection {

	public static void main(String[] args) {

		ArrayList<Integer> list=new ArrayList<Integer>();  //Autoboxing, 10 is considered as object.
		list.add(10);
		list.add(20);
		list.add(50);
		list.add(30);
		list.add(10);
		
		System.out.println(list);
		System.out.println(list.get(2));
		list.remove(2);
		System.out.println(list);
		
		System.out.println("Iterating list collection...Way - 1  ");
		
		//Iterating list collection...Way - 1 
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("Iterating list collection...Way - 2  ");
		
		//Way - 2
		for(Integer o:list) {
			System.out.println(o);
		}
		
		System.out.println("Iterating list collection...Way - 3  ");
		
		//Way - 3
		Iterator<Integer> it= list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
