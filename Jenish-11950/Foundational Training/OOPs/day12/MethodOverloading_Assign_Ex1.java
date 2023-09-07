package com.jenish.day12;

class Addition {
	int a;
	int b;
	void add(int a, int b) {
		System.out.println(a+b);
	}
	void add(float a, float b) {
		System.out.println(a+b);
	}
	void add(double a, double b) {
		System.out.println(a+b);
	}
	//public void display() {
		// TODO Auto-generated method stub
		
	
}
	
public class MethodOverloading_Assign_Ex1 {

	public static void main(String[] args) {
		Addition obj_1 = new Addition();
		obj_1.add(2, 5);
		obj_1.add(2.0f, 7.0f);
		obj_1.add(4.0d, 9.0d);
		//obj_1.display();

	}

}
