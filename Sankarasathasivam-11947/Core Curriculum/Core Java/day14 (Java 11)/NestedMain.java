package com.shiva.core.day14;

public class NestedMain {

	private void display() {
		System.out.println("Hello from private method");
	}

	class NestedMain1 {
		void msg() {
			display();
		}
	}

	public static void main(String[] args) {

		NestedMain m = new NestedMain();
		NestedMain.NestedMain1 n = m.new NestedMain1();
		m.display();

	}
}
