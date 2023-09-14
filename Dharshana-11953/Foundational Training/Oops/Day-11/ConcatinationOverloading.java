package com.dharshu.day11;

class Concatination{
	void concat(int a,int b) {
		System.out.println("Concatination of Integer:"+a + +b);
	}
	
	void concat(float a,float b) {
		System.out.println("Concatination of Float:"+a + +b);
	}
	
	void concat(String a,String b) {
		System.out.println("Concatination of String:"+a+b);
	}
}

public class ConcatinationOverloading {

	public static void main(String[] args) {
		Concatination cn=new Concatination();
		cn.concat(2, 2);
		cn.concat(9.0f, 8.0f);
		cn.concat("Dharshu", "Alagar");
		

	}

}
