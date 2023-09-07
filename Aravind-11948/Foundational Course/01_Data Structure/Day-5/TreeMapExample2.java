package com.aravind.day5;
import java.util.TreeMap;
public class TreeMapExample2 {

	public static void main(String[] args) {
		TreeMap<Character,Integer> map=new TreeMap<Character,Integer>();
		map.put('A', (int)'A');
		map.put('D', (int)'D');
		map.put('Z', (int)'Z');
		map.put('C', (int)'C');
		System.out.println(map);// {A=65, C=67, D=68, Z=90}
		
		map.put('C', (int)'k');//update in c key c t0 k
		
		System.out.println(map);//{A=65, C=107, D=68, Z=90}
		

	}

}
