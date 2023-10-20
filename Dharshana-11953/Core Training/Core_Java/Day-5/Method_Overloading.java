package com.dharshu.day5;

public class Method_Overloading {
	void concat(int a,int b) {
		System.out.println(a+" "+b);
	}
	
	void concat(String a,String b) {
		System.out.println(a+" "+b);
	}
	
	void concat(float a,float b) {
		System.out.println(a+" "+b);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_Overloading obj = new Method_Overloading();
		obj.concat("Dharshu","Minion");
		obj.concat(23,02);
		obj.concat(23.01f, 10.10f);

	}

}
