package com.gayathri.day5;
//adding the extra functionality to the existing method 

public class MethodOverLoadEx {

	void concat(int a, int b) {
		System.out.println(a +" "+ b);
	}
	void concat(String a, String b) {
		System.out.println(a +" "+ b);
	}
	void concat(float a, float b) {
		System.out.println(a +" "+ b);
	}
	
	public static void main(String[] args) {
		MethodOverLoadEx obj = new MethodOverLoadEx();
		obj.concat(5.5f,10.5f);
		obj.concat(10, 10);
		obj.concat("Gayathri", "Devi");
		

	}

}
