package com.aravind.day5;

import java.util.TreeMap;

public class TreeMapExample1 {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		//two genrics becuase key and value;
		
		map.put(10, "java");
		map.put(5, "c");
		map.put(20, "python");
		map.put(15, "c++");
		map.put(26, null);//accept the null value
		//map.put(null, null);// null poiter exception

		System.out.println(map);// {5=c, 10=java, 15=c++, 20=python}

		map.put(15, "php");

		System.out.println(map);

		// {5=c, 10=java, 15=c++, 20=python}
		// {5=c, 10=java, 15=php, 20=python}just updating the value of key 15 c++ tp
		// php;

	}

}
