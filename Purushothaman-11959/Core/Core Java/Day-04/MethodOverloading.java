package com.purushoth.day_04;

public class MethodOverloading {
	void concat(int a,int b) {
		System.out.println(a+" "+b);
	}

	void concat(String a,String b) {
		System.out.println(a+""+b);
	}
	
	void concat(float a,float b) {
		System.out.println(a+" "+b);
	}
	
	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		obj.concat(8, 7);
		obj.concat("Purushoth","aman");
		obj.concat(13.0f,17.8f );

	}

}
