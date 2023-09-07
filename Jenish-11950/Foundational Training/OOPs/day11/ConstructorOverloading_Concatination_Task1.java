package com.jenish.day11;
class MyConcatination  {
	void concat(int a, int b){
		System.out.print("Concatination of Integer: " +a);	
		System.out.println(b);
		}
	void concat(float a, float b){
		System.out.print("Concatination of Float: " +a);	
		System.out.println(b);
	}
	void concat(String a, String b){
		System.out.println("Concatination of String: " +a+b);
	
}
}
public class ConstructorOverloading_Concatination_Task1 {

	public static void main(String[] args) {
		MyConcatination obj = new MyConcatination();
		obj.concat(10, 20);
		obj.concat(2.0f, 3.0f);
		obj.concat("Jenish ", "Sara");
				

	}

}

