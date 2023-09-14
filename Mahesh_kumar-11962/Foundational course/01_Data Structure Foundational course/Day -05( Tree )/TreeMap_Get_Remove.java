package com.mahesh.ds_day5;

import java.util.TreeMap;
import java.util.Scanner;

public class TreeMap_Get_Remove {

	public static void main(String[] args) {
		TreeMap<Character,Integer> Tree_Map = new TreeMap<Character,Integer>();
		Scanner sc_ob = new Scanner(System.in);
		System.out.println("Enter your range :");
		int range = sc_ob.nextInt();
		System.out.println("Enter your values oneby one :");
		for (int index = 0; index < range; index++) {
			char ch;
			System.out.print("   ");
			Tree_Map.put( ch=sc_ob.next().charAt(0),(int)ch);
			System.out.println(" --*-- ");
		}

		System.out.println(Tree_Map);
	}

}
