package com.sara.CoreJava.Day_17;

interface Printable {
	void print();
}

record Emp(String name, int id) implements Printable {
	public void print() {
		System.out.println("Name : " + name + ", EmpID : " + id);
	}
}

public class RecordInterface {

	public static void main(String[] args) {
		Emp person1 = new Emp("Jeban", 11963);
		person1.print();

		Emp person2 = new Emp("Shaji", 11962);
		person2.print();
	}

}
