//Multiple Inheritance using Interface

package com.jeyandhan.day14;

interface One {
	int a = 10; // public, static, final
}

interface Two {
	int a = 20; // public, static, final
}

interface Three extends One, Two {
	void addition(); // Public, Abstract
}

class Add implements Three {
	public void addition() {
		System.out.println("Addition: " + (One.a + Two.a)); // to prevent ambiguity we call by interface name
															// (by default interface variables are static)
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		// object creation

		Add obj = new Add();
		
		//Method calling
		obj.addition();

	}

}
