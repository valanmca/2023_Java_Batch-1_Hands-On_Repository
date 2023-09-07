//Method over loading (sum of two values)

package com.jeyandhan.day12;

public class Addition {

	public void add(int a, int b) { //integer type arguments
		System.out.println("Addition of two integer value is: " +(a+b));
	}

	public void add(float a,float b) { //float type arguments
		System.out.println("Addition of two float value is: " +(a+b));
	}

	public void add(double a, double b) { //double type arguments
		System.out.println("Addition of two double value is: " +(a+b));
	}

	public static void main(String[] args) {
		// object creation
		
		Addition obj = new Addition();
		
		//method calling
		obj.add(14, 6);
		obj.add(12.5f, 13.5f);
		obj.add(10.2, 13.5);
		

	}

}
