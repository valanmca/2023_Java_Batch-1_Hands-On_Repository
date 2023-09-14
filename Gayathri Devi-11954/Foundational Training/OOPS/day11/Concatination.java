package com.gayathri.day11;

class ConcatinationOverloading {
	void concatValue(String a,String b) {
		System.out.println(a+b);
	}

	void concatValue(float a,float b) {
		System.out.println(""+a+b);
	}
	void concatValue(int a,int b) {
		System.out.println(""+a+b);
	}
}

public class Concatination {

	public static void main(String[] args) {
		ConcatinationOverloading object = new ConcatinationOverloading();// will take a memory during run time in heap memory 
		
		object.concatValue("Gayathri","Devi");
		object.concatValue(50, 50);
		object.concatValue(19.90f, 52.90f);
	}

}
