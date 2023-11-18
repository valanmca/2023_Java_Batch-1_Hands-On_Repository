//Example for Nested Based Access Control
package com.sara.CoreJava.Day_16;

public class NestedBasedAccessControl {
	private void display() {
		System.out.println("hello from private method");
	}

	class NestedMain {
		void msg() {
			display();
		}
	}

	public static void main(String[] args) {

		NestedBasedAccessControl m = new NestedBasedAccessControl();
		NestedBasedAccessControl.NestedMain n = m.new NestedMain();
		n.msg();

	}

}
