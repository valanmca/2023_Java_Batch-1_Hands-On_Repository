//Example for Record class with Interface
package com.sara.CoreJava.Day_17;

interface Printable1 {
	void print();
}

record Employee(String name, int id) implements Printable1 {
	public void print() {
		System.out.println("Name: " + name + ", EmpID: " + id);
	}
}

public class RecordWithInterface {

	public static void main(String[] args) {
		Employee person1 = new Employee("Jeban", 11963);
		person1.print();

		Employee person2 = new Employee("Shaji", 11962);
		person2.print();
	}

}
