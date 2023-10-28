// It removes the duplicate values.

package JavaCollect9;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.Iterator;

public class Hash {

	public static void main(String[] args) {

		HashSet<Integer> list=new HashSet<Integer>();  //Autoboxing, 10 is considered as object.
		list.add(10);
		list.add(20);
		list.add(50);
		list.add(30);
		list.add(10);
		
		System.out.println(list); //Does not allow duplicate values.
		
		//System.out.println(list.get(2));  Set is not index based ,it throws error.
		
		list.remove(50); //50 is considered as value, it is not index based.
		System.out.println(list);
		
		
		System.out.println("Iterating set collection...Way - 1  ");
		//Way - 1
		for(Integer o:list) {
			System.out.println(o);
		}
		
		System.out.println("Iterating set collection...Way - 2  ");
		
		//Way - 2
		Iterator<Integer> it= list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		
		
		
	}

}
