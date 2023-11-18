package com.purushoth.day_15;

public class NestedEg {
	private void display() {
		System.out.println("Hello from private method");
	}
	class NestedMain{
		void msg() {
			display();
		}
	}

	public static void main(String[] args) {
		NestedEg ne=new NestedEg();
		NestedEg.NestedMain n=ne.new NestedMain();
		ne.display();

	}

}
