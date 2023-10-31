package com.purushoth.day_10;

import java.util.HashSet;
import java.util.Iterator;

public class Set {

	public static void main(String[] args) {
		HashSet<Integer> set=new HashSet<Integer>();
        set.add(10);
        set.add(50);
        set.add(20);
        set.add(40);
        set.add(30);
        
        System.out.println(set);
        
        set.remove(40);
        System.out.println(set);
        
        
        //Way-2
        System.out.println("Way-2");
        for(Integer a:set) {
        	System.out.println(a);
        }
        
        //Way-3
        System.out.println("Way-3");
        Iterator<Integer> it=set.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
	}

}
