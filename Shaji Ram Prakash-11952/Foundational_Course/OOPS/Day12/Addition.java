package com.shaji.Day12;

public class Addition {
	
	public void Add(int x,int y ) {
		System.out.println("Addition of two value is "+(x+y));
	}
	
	public void Add(float x, float y) {
		System.out.println("Addition of two value is "+(x+y));
	}

	public void Add(double x, double y) {
		System.out.println("Addition of two value is "+(x+y));
	}

	public static void main(String[] args) {
		Addition obj = new Addition();
		obj.Add(10, 24);
		obj.Add(21.0f, 24.0f);
		obj.Add(14.0, 24.0);
	}

}
