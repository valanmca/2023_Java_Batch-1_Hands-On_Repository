package com.gayathri.day17Java17Features;

interface Printable{
	void print();
}

record Emp (String name, int id) implements Printable{
	public void print() { 
		System.out.println("Name : "+name+" , Id : "+id);
	}
}

public class P5RecordInterface {
	public static void main(String args[]) {
		Emp per1 = new Emp("Gayathri",11954);
		per1.print();
		Emp per2 = new Emp("Devi",11954);
		per2.print();
	}

}
