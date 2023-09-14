package com.jenish.day06;

import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearch_Algorithm_AL_Sample_Ex2 {

	public static void main(String[] args) {
		ArrayList<Character> list= new ArrayList<Character>();
		list.add('B');
		list.add('E');
		list.add('A');
		list.add('F');
		list.add('H');
		list.add('K');
		System.out.println("Enter the Character to Search:");
		Scanner sc= new Scanner (System.in);
		char k=sc.next().charAt(0);
		boolean isPresent = false;
		for(int i=0; i<list.size(); i++) {
			if(k==list.get(i)) {
				System.out.println("Elements present in the index:" +i);
				isPresent=true;
				break;
	}

}
		if(isPresent==false)
			System.out.println("Enter not Present");
		sc.close();
	}
}
