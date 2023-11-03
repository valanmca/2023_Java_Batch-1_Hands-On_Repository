package com.gayathri.day12MAP;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Iterator;
public class P1HashMap {

	public static void main(String[] args) {
		HashMap <Integer,String> map = new HashMap<Integer,String>();
		map.put(10,"Gayathri");
		map.put(20, "Devi");
		map.put(30,"Sakthi");
		System.out.println(map);
		map.put(20,"Yathrik");//not adding duplicate.... it replacing the old one.
		System.out.println(map);
		map.put(null, "Devi");//null key accepted
		map.put(11, null);//null value accepted
		System.out.println(map);
		System.out.println(map.get(30));//sakthi
		map.remove(20);//key
		System.out.println(map);

		
		//way 1 traversing
		System.out.println("Way 1");
		Set <Integer> set = map.keySet();
		System.out.println(set);
		Iterator <Integer> it = set.iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.println(key +" => "+map.get(key) );
		}
		
		//way 2 traversing
		System.out.println("Way 2");
		Set <Entry<Integer,String>> set1 = map.entrySet();
		System.out.println(set1);
		
		Iterator <Entry<Integer,String>> it1 = set1.iterator();
		while(it1.hasNext()) {
			Entry<Integer,String> e = it1.next();
			System.out.println(e.getKey()+" => "+e.getValue());
			
		}
		
		
	}

}
