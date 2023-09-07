package com.jeban.day5;//Tree Map Problem
import java.util.TreeSet;
import java.util.TreeMap;


public class TreeMap5 {
	public static void main(String[] args) {
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		
		map.put(10, "java");
		map.put(56, "C");
		map.put(34, "Python");
		map.put(5, "Php");
		map.put(2, "SQl");
		
		System.out.println("key=value is:" +map);
		map.put(20,"SQL");
		System.out.println("key=value is:" +map);
		
		
		
	}

}
