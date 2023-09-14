package com.mahesh.ds_day5;

import java.util.TreeMap;

public class TreeMap_Intro {

	public static void main(String[] args) {
	TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
	//In treemap we use two generices <key,value>
	//In treemap key must be unique,value allows duplicates.
	
	tm.put(10, "C_Program");
	tm.put(20, "C++_Program");
	tm.put(30, "JAVA_Program");
	System.out.println(tm);//{10=C_Program, 20=C++_Program, 30=JAVA_Program}
	
	tm.put(30, "Python_Program");
	System.out.println(tm);//{10=C_Program, 20=C++_Program, 30=Python_Program}
	
	tm.put(30, "JAVA_Program");
	System.out.println(tm);//{10=C_Program, 20=C++_Program, 30=JAVA_Program}
	}

}
