package com.shiva.core.day05;

public class Override4 {
	void concat(int a,int b) {
		System.out.println(a+" "+b);
	}
	
	void concat(String a, String b) {
		System.out.println(a+" "+b);
	}
	
	void concat(float a,float b) {
		System.out.println(a+" "+b);
	}
	public static void main(String[] args) {
		Override4 obj=new Override4();
		obj.concat("Sankara", "sathasivam");
		obj.concat(12.34f, 13.4f);
		obj.concat(10, 20);

	}

}
