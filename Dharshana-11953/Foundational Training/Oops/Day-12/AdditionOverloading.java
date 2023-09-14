package com.dharshu.day12;

class Addition{

	void add(int x,int y) {
		System.out.println("Addition of integer:"+(x+y));
	}
	
	void add(float x,float y) {
		System.out.println("Addition of float:"+(x+y));
	}
	
	void add(double x,double y) {
		System.out.println("Addition of Double:"+(x+y));
	}
}

public class AdditionOverloading {

	public static void main(String[] args) {
		Addition intadd=new Addition();
		intadd.add(2,2);
		
		Addition floatadd=new Addition();
		floatadd.add(2.0f,2.0f);
		
		Addition doubleadd=new Addition();
		doubleadd.add(2.2,2.2);
		
		}

	}

