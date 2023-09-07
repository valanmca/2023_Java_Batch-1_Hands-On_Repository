package com.muthu.day2;
import java.util.Scanner;
import java.util.ArrayList;

public class arrayaddeven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>();


		System.out.println("enter the total number:");
		int n=sc.nextInt();
		
		for(int i=0; i<n; i++){
			list.add(sc.nextInt());
		}

	   ArrayList<Integer> evenList = new ArrayList<Integer>();
	   ArrayList<Integer> oddList = new ArrayList<Integer>();
	   
	   for(int i=0; i<n; i++){
			int temp = list.get(i);
			if(temp %2 == 0)
				evenList.add(temp);
			else
				oddList.add(temp);
		}
	   
	   System.out.println(evenList);
	   System.out.println(oddList);
	}

}
