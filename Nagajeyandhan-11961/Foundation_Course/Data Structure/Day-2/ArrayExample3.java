//Add,delete,update elements in ArrayList

package com.jeyandhan.day02;
import java.util.*;
public class ArrayExample3 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int sum;
		list.add(10); // inserting elements
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println("The elements in the list are: "+list);
		
		sum=list.get(2)+list.get(3); //adding two elements by index
		System.out.println(sum);
		
		list.add(0,sum); // insert element in the first
		System.out.println(list);
		
		list.set(list.size()-1, 100); // update the last element
		System.out.println(list);
		
		list.remove(0); //remove the element
		System.out.println(list);
		
	}

}
