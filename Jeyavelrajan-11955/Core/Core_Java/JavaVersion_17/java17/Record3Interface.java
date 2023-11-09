package com.jeyavel.core.java17;

interface Printable{
	void print();
}
record Emp(String name,int id)implements Printable{
	public void print() {
		System.out.println("Name:"+name +", EmpID: "+ id);
	}
}

public class Record3Interface {

	public static void main(String[] args) {
		Emp person1 = new Emp("harrish",11916);
		person1.print();
		Emp person2 = new Emp("jeyavel",11955);
		person2.print();

	}

}
