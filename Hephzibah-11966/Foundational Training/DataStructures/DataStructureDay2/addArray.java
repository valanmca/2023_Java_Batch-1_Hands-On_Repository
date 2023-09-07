package DataStructureDay2;

import java.util.ArrayList;

public class addArray {

	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(10); //adding elements in list
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println("List is:" + list);
		
	    list.set(2, 50);// updating the elements
	    System.out.println("List after update:" +list);
	    
	    System.out.println("getting an element: " + list.get(1));//getting one element
	    
	    System.out.println("List of Arrays are:");
	    for(int i=0; i<list.size(); i++) {
	    	System.out.println(list.get(i));
	    }System.out.println(list);
	    
		
	}

}
