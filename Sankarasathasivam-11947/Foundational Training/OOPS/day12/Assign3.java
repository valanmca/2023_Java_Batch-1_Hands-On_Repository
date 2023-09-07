package com.shiva.day12;

//Overloading Assign

class Addition
{
	Addition(int x, int y)
	{
		System.out.println("The Addition of x and y : "+(x+y));
	}
	
	Addition(float x,float y)
	{
		System.out.println("The Addition of x and y : "+(x+y));
	}
	
	Addition(double x,double y)
	{
		System.out.println("The Addition of x and y : "+(x+y));
	}
}

public class Assign3 {

	public static void main(String[] args) {
		Addition addition=new Addition(2.0,2.0);
		
//		addition.add(20, 20);
//		addition.add(7.0, 7.0);
//		addition.add(2222222, 2222222);
		
	}

}
