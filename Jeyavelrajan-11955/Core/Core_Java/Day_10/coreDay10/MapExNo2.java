package com.jeyavel.coreDay10;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class MapExNo2 {
   
	public static void main(String[] args) {
	LinkedHashMap<Integer,String> hashMap = new LinkedHashMap<Integer,String>();
	hashMap.put(10, "Jeyavel");
	hashMap.put(20, "Matthew");
	hashMap.put(30, "Mahesh");
	hashMap.put(40, "Jeyanthan");
	hashMap.put(50, "raj");
	hashMap.put(50, "rajan");
	System.out.println(hashMap);
	System.out.println(hashMap.get(20));
	System.out.println(hashMap.remove(40)+"Removed");
	System.out.println(hashMap);
	
	
	//Way-1 converting all the keys into Set
	Set<Integer> set = hashMap.keySet();
	System.out.println(set);
	//And traverse it - using Iterator
	Iterator <Integer> it = set.iterator();
	while(it.hasNext()) {
		Integer key = it.next();
		System.out.println(key + "=>"+hashMap.get(key));
	}
	//Converting the Enter Map into Set
	Set<Entry<Integer,String>> set1 = hashMap.entrySet();
	//Merging the key and value - it is called asEntry (or) converting it into Entry
    System.out.println(set1);
    Iterator<Entry<Integer,String>> it1 = set1.iterator();
    while(it1.hasNext()) {
    	Entry<Integer, String> e = it1.next();
    	System.out.println(e.getKey()+"=>"+e.getValue());
    }
    

	}

}
