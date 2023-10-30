package com.core.day_10;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

//  linked hashmap output comes in Insertion order

public class LinkedHashMap1 {

	public static void main(String[] args) {
		
		 LinkedHashMap <Integer,String> map= new LinkedHashMap <Integer,String>();
		 
		map.put(10,"aravind ");
		
		map.put(30,"dom");
		map.put(20,"jeban");
		map.put(null, "kumar");
		
		System.out.println(map);
		
		
		Set <Integer  >set=map.keySet();
		System.out.println(set);
		
		Iterator <Integer> it=set.iterator();
		
		while (it.hasNext())
		{
			Integer key=it.next();
			System.out.println(key+"==>"+map.get(key));
		}
		
		
		Set <Entry<Integer,String>> set1=map.entrySet();
		Iterator <Entry<Integer,String> > it1=set1.iterator();
		
		System.out.println(set1);
		
		while(it1.hasNext())
		{
			Entry<Integer,String> e=it1.next();
			
			System.out.println(e.getKey()+"==>"+e.getValue());
		}
	}

}
