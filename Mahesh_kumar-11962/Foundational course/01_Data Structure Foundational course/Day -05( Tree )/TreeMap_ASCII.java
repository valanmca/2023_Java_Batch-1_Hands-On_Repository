package com.mahesh.ds_day5;
import java.util.TreeMap;

public class TreeMap_ASCII {

	public static void main(String[] args) {
		TreeMap<Character,Integer> tm = new TreeMap<Character,Integer>();
		//In treemap we use two generices <key,value>
		//In treemap key must be unique,value allows duplicates.
		
		tm.put('A',(int)'A');
		tm.put('B',(int)'B');
		tm.put('C',(int)'C');
		System.out.println(tm);//{A=65, B=66, C=67}
		tm.put('*',(int)'*');
		System.out.println(tm);//{*=42, A=65, B=66, C=67}
		tm.put('a',(int)'a');
		System.out.println(tm);//{*=42, A=65, B=66, C=67, a=97}
		tm.put('b',(int)'b');
		System.out.println(tm);//{*=42, A=65, B=66, C=67, a=97, b=98}
		
		tm.put(' ',(int)' ');//' '=>it means one keyspace
		System.out.println(tm);//{ =32, *=42, A=65, B=66, C=67, a=97, b=98}

	}

}
