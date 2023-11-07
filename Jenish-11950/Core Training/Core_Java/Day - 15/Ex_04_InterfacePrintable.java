package com.jenish.day15;

interface Printable {
	void print();
}
record Emp(String name, int id) implements Printable{
	public void print() {
		System.out.println("Name: " + name + ", EmpID : " + id);
	}
}
public class Ex_04_InterfacePrintable {

	public static void main(String[] args) {
		Emp person1 = new Emp("Jenish", 11950);
		person1.print();
		Emp person2 = new Emp("Naveen", 11958);
		person2.print();
	}

}
