package com.matthew.day02;
import java.util.*;
public class project3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();
		ArrayList<Integer> even = new ArrayList<Integer>();
		System.out.println("Enter thelist length : ");
		int len = sc.nextInt();
		for (int i = 0; i<len;i++) {
			int temp = sc.nextInt();
			list.add(temp);
		}
		System.out.println("List:"+list);
		for(int i =0;i<list.size();i++) {
			if(list.get(i)%2!=0) {
				even.add(i);
			}
			else {
				odd.add(i);
			}
		}
		System.out.println("odd :"+odd);
		System.out.println("even:"+even);

	}

}
