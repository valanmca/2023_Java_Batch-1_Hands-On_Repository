package com.muthu.day2;
import java.util.LinkedList;
public class Linklist1 {

	public static void main(String[] args) {
	LinkedList<Integer> list =new LinkedList<Integer>();
	//adding the elrements at the end
	
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	System.out.println(list);
	
	list.add(1,25);//Inserting the elements using index 
	System.out.println(list);
	
	
	list.set(1,100);//updated
	System.out.println(list);
	
	
	list.remove(1);
	System.out.println(list);//[10,20,30,40]
	
System.out.println(list.size());//4


  for(int i=0; i<list.size();i++) {
	  System.out.println(list.get(i));
  }
    
	
	
	}

}
