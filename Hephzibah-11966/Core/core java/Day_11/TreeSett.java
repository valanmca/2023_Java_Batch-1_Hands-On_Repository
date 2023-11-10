package Day_11;


import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSett {

	public static void main(String[] args) {    //Order of the element will be Ascending.
		TreeSet<Integer> list=new TreeSet<Integer>(Collections.reverseOrder());  //Implementing classes are : TreeSet
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
