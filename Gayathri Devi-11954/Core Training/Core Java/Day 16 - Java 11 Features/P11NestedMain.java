package com.gayathri.day16Java11Features;

public class P11NestedMain {
	private void display() {
		System.out.println("Form private method");
	}

	class NestedMain {
		void msg() {
			display();
		}
	}

	public static void main(String[] args) {
		P11NestedMain m = new P11NestedMain();
		P11NestedMain.NestedMain n = m.new NestedMain();
		n.msg();

	}
}
