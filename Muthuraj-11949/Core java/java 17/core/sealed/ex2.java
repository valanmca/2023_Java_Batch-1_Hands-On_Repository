package com.core.sealed;
interface Printable{
	void print();
}
record Emp(String name,int id) implements Printable{
	public void print() {
		System.out.println("Name:"+name+", EmpID:"+id);
	}
}
public class ex2 {

	public static void main(String[] args) {
		
		Emp person1 = new Emp("Muthu",12344);
		person1.print();
		

		Emp person2 = new Emp("Raj",1234);
		person2.print();
		

	}

}
