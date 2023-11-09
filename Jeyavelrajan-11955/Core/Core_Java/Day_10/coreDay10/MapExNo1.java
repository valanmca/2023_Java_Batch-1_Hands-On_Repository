package com.jeyavel.coreDay10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;


public class MapExNo1 {

	public static void main(String[] args) {
		HashMap <Integer,String> map = new HashMap<Integer,String>();
		map.put(20, "jeyavel");
		map.put(10, "Matthew");
		map.put(30, "Mahesh");
		map.put(40, "Jeyanthan");
		map.put(50, "raj");
		map.put(50, "rajan");
		System.out.println(map);
		System.out.println(map.get(20));
		System.out.println(map.remove(40)+"Removed");
		System.out.println(map);
		
		
		//Way-1 converting all the keys into Set
		Set<Integer> set = map.keySet();
		System.out.println(set);
		//And traverse it - using Iterator
		Iterator <Integer> it = set.iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.println(key + "=>"+map.get(key));
		}
		//Converting the Enter Map into Set
		Set<Entry<Integer,String>> set1 = map.entrySet();
		//Merging the key and value - it is called asEntry (or) converting it into Entry
        System.out.println(set1);
        Iterator<Entry<Integer,String>> it1 = set1.iterator();
        while(it1.hasNext()) {
        	Entry<Integer, String> e = it1.next();
        	System.out.println(e.getKey()+"=>"+e.getValue());
        }
        

        
        
	}

}
