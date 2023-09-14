package com.swetha.day2;
import java.util.ArrayList;
public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		//Adding five elements in an arraylist
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		//Sum of elements at index 2 and 3
		int sum=list.get(2)+list.get(3);
        System.out.println("Sum of elements at index 2 and 3 : "+ sum);
        
        //Insert the sum value at index 0
        list.add(0,sum);
        System.out.println("The arrayList with sum value at index 0 : ");
        System.out.println(list);
        
        //Replace last element with 100
        int n=list.size();
        list.set(n-1,100);
        System.out.println("The ArrayList with last element replaced with 100 : "+list);
        
        //REmove the first element from the ArrayList
        list.remove(0);
        System.out.println("The final ArrayList will be : " +list);
        
	}

}
