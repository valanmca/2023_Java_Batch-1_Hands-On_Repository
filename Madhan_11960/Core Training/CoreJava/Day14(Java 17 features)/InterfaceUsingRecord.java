package com.madhan.java17;


interface Printable {
	void print();
}
record Emp(String name, int id) implements Printable {
	public void print() {
		System.out.println("Name: " + name + ", EmpID: " + id);
	}
}
public class InterfaceUsingRecord {
	public static void main(String[] args) {
		Emp person1 = new Emp("Madhan", 11960);
		person1.print();
		Emp person2 = new Emp("Aravind", 11958);
		person2.print();
	}
}


