package com.shiva.core.day15;

interface Printable {
	void print();
}

record Emp(String name, float salary) implements Printable {

	@Override
	public void print() {
		System.out.println("Name: " + name + " , Salary: " + salary);

	}

}

public class RecordClass2 {

	public static void main(String[] args) {

		Emp e1 = new Emp("Dom", 30000);
		e1.print();

	}

}
