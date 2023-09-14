package com.madhan.day02;
import java.util.*;

public class ArrList {

	public static void main(String[] args) {
		ArrayList<Integer> list =new ArrayList<Integer>();
		System.out.println("Size:"+list.size());
		System.out.println(list);
		list.add(90);  //Adding the element in the end
		list.add(100);
		list.add(50);
		list.add(-1);
		list.add(null);
		System.out.println("Size:"+list.size());
		System.out.println(list);
		list.remove(3);  // Removing the element by index
		System.out.println("Size:"+list.size());
		System.out.println(list);
		list.add(1,98); //updating the element with particular index
		System.out.println("Size:"+list.size());
		System.out.println(list);
	}

}
