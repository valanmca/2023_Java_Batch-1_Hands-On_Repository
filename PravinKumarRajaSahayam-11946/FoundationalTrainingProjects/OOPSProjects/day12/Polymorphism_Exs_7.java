//Over Loading Method for the Add the Numbers
package com.pravinkumar.day12;
//Using this Keyword for Over Loading Method
class Student {
	int a;
	int b;

	Student() {
		this(2, 3);
	}

	Student(int a, int b) {
		this.a = a;
		this.b = b;
		this.findSum();
	}

	public void findSum() {
		int sum = 0;
		sum = a + b;
		System.out.println("The Sum is : " + sum);
	}
}

public class Polymorphism_Exs_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student();
	}

}
