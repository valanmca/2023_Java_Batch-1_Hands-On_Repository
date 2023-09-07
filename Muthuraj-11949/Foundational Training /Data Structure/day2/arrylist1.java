package com.muthu.day2;
import java.util.ArrayList;
public class arrylist1 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		System.out.println("size:"+list.size());
		System.out.println(list);
		
		list.add(10); //adding an element at the end
		System.out.println("size:"+list.size());//1
		
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println("size:"+list.size());//4
		System.out.println(list);
		
		list.remove(2);//removing by using index
		
		System.out.println("size:"+list.size());
		System.out.println(list);
		
		list.add(1,55);
		
		System.out.println("size:"+list.size());
		System.out.println(list);
		
		
		list.remove(1);
		
		System.out.println("size:"+list.size());
		System.out.println(list);	
		
		

	}

}
