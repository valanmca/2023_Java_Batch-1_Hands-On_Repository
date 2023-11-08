package com.gayathri.day15Java8Features;

import java.util.LinkedList;
import java.util.Optional;

public class P3OptionalClass {

	public static void main(String[] args) {
		LinkedList <Integer> list = new LinkedList <Integer> ();
		list.add(100);
		list.add(200);
		list.add(300);
		//System.out.println(list);
		Optional <LinkedList<Integer>> obp = Optional.of(list);
		System.out.println(obp.get());
		
		int a = 50;
		Optional<Integer> singleobj = Optional.of(a); //value vangurathuku
		System.out.println(singleobj.get());
		
		String[] str = new String[10];
		str[1] = "Gayathri";
		str[2] = "Devi";
		Optional<String> opt = Optional.ofNullable(str[1]);
		System.out.println(opt.get());
		System.out.println(str[1]);
		
	}

}
