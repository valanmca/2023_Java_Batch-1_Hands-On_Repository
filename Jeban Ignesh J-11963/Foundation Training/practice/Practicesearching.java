package com.jeban.practice;

import java.util.Scanner;
import java.util.ArrayList;

public class Practicesearching {

	public static void main(String[] args) {
		ArrayList <Integer> list=new ArrayList<Integer>();
		System.out.println(list.size());
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter values:");
		
		for(int i=0; i<5;i++) {
			list.add(sc.nextInt());
			
		}
		System.out.println(list);
		


	}

}
