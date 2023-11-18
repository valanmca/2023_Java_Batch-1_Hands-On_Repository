package com.purushoth.day_11;

import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapEg {

	public static void main(String[] args) {
	
	HashMap<Integer,String> map=new HashMap<Integer,String>();//It will display in any order.
	
	map.put(20, "Magesh");
	map.put(10, "Shiva");
	map.put(30, "Dom");
	map.put(null, "Aravind");//Null will be a key.
	System.out.println(map);

	map.put(20, "Jeyandhan");//Adding another value to the same key it will update.
	map.put(null, "Jeban");//It is for null also.
	
	System.out.println(map);
	map.remove(10);
	System.out.println(map);
	System.out.println(map.get(30));
	
	//Way-1
	Set<Integer> set=map.keySet(); //To iterate the values in map.
	System.out.println(set);
	Iterator<Integer> it=set.iterator();
	while(it.hasNext()) {
		Integer key=it.next();
		System.out.println(key +"=>"+map.get(key));
	}
	
	//Way-2
	Set<Entry<Integer,String>> set1=map.entrySet(); //To iterate the values in map.
	System.out.println(set1);
	Iterator<Entry<Integer,String>> it1=set1.iterator();
	while(it1.hasNext()) {
		Entry<Integer,String> e=it1.next();
		System.out.println(e.getKey()+"=>"+e.getValue());
	}
	

	}

}
