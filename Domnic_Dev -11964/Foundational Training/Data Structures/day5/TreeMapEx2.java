////basic operations on TreeMap  printing ASCII Values
package com.domnic.day5;
import java.util.TreeMap;
public class TreeMapEx2 {

	public static void main(String[] args) {
		TreeMap<Character,Integer> map=new TreeMap<Character,Integer>();
        map.put('A', (int)'A');
        map.put('B', (int)'B');
        map.put('C', (int)'C');
        map.put('L', (int)'L');
        map.put('M', (int)'M');
        
        
        System.out.println(map);
        System.out.println();
        map.put('a', (int)'a');
        map.put('b', (int)'b');
        map.put('c', (int)'c');
        map.put('l', (int)'l');
        map.put('m', (int)'m');
        map.remove('l',(int)'l');
        System.out.println(map);
	}

}
