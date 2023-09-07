package com.muthu.day2;
import java.util.LinkedList;
public class linklist2 {

	public static void main(String[] args) {
	LinkedList<String> list =new LinkedList<String>();
	//adding the elements at the end
	
	list.add("c");
	list.add("c++");
	list.add("java");
	list.add("python");
	System.out.println(list);
	
	list.add(1,"net");//Inserting the elements using index 
	System.out.println(list);
	
	
	list.set(1,"pHp");//updated
	System.out.println(list);
	
	
	list.remove(3);
	System.out.println(list);//["c","c++","java","python"]
	
System.out.println(list.size());//4


  for(int i=0; i<list.size();i++) {
	  System.out.println(list.get(i));
  }
    
	
	
	}

}
