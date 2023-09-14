package com.swetha.day11;
class MyConcatenation{
	void concat(int a,int b){
		System.out.println("The concatenation "+a+b);
		}
	void concat(float a,float b) {
		System.out.println("The concatenation "+a+b);
	}
	void concat(String a,String b) {
		System.out.println(a+b);
		
	}
}

public class Concatenation {

	public static void main(String[] args) {
		MyConcatenation obj=new MyConcatenation();
		obj.concat(12,20);
		obj.concat(5.0f,2.0f);
		obj.concat("Swe", "tha");

	}

}
