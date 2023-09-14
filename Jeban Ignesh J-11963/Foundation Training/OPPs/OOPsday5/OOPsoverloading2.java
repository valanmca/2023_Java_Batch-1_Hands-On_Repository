//*****Method Overloading for Addition class******////

package com.jeban.OOPsday5;

class Addition{
	void add(int a,int b) {
		System.out.println("sum of :"+(a+b));
	}
	void add(float x,float y) {
		System.out.println("Sum of:"+(x+y));
	}
	void add(double m,double n) {
		System.out.println("Sum of:"+(m+n));
	}
	
	
	
}

public class OOPsoverloading2 {

	public static void main(String[] args) {
		Addition obj=new Addition();
		obj.add(10, 20);
		obj.add(100.f, 200.0f);
		obj.add(233, 344);
	

	}

}
