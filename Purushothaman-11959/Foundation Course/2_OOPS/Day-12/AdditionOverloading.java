package com.purushoth.day12;


public class AdditionOverloading {
	
	void add(int x,int y) {
		int add=x+y;
		System.out.println(add);
		
	}
	
	void add(float x,float y) {
		float add=x+y;
		System.out.println(add);
		}
	
	void add(double x,double y) {
		double add=x+y;
		System.out.println(add);
	}

	public static void main(String[] args) {
		AdditionOverloading obj=new AdditionOverloading();
		obj.add(10, 20);
		obj.add(20.0f, 35.0f);
		obj.add(234567,34467);
		

	}

}//Addition for method overloading.
