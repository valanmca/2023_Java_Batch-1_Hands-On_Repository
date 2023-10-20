package com.jeban.Inheritance;


public class Inheritance4 {
	void concat(int a,int b) {
		System.out.println(a+" "+ b);
	}
	void concat(String a,String b) {
		System.out.println(a+" "+ b);
	}
	void concat(float a,float b) {
		System.out.println(a+" "+b);
	}

	public static void main(String[] args) {
		 Inheritance4 obj=new  Inheritance4();
		 obj.concat("Jeban","Ignesh");
		 obj.concat(12.34f,  13.4f);
		 obj.concat(10,  20);
		

	}

}
