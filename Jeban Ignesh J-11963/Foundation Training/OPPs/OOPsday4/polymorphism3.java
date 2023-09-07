package com.jeban.OOPsday4;//Method Overloading

class Leafs {
	void Eightes() {
		System.out.println("Write using Leafs");
	}
}

class Slates {
	void Ninetes() {
		System.out.println("Write using Slates");
	}
}

class Notebook {
	void twenties() {
		System.out.println("Write using Notebooks");

	}
}

class Laptop {
	void aftertwenties() {
		System.out.println("Write using Laptops");

	}

}

class Smartphones {
	void now() {
		System.out.println("Write using SmartPhones");
	}
}

class Student {
	public void note(Leafs leafs) {
		leafs.Eightes();

	}

	public void note(Slates slates) {
		slates.Ninetes();
	}

	public void note(Notebook notebook) {
		notebook.twenties();
	}

	public void note(Laptop laptop) {
		laptop.aftertwenties();
	}

	public void note(Smartphones smartphones) {
		smartphones.now();
	}
}

public class polymorphism3 {

	public static void main(String[] args) {

		Leafs leafs = new Leafs();

		Slates slates = new Slates();

		Notebook notebook = new Notebook();

		Laptop laptop = new Laptop();

		Smartphones smartphones = new Smartphones();

		Student v1 = new Student();
		v1.note(leafs);

		System.out.println(" ");

		Student v2 = new Student();
//		v1.note(leafs);
		v2.note(slates);

		System.out.println(" ");

		Student v3 = new Student();
//		v1.note(leafs);
//		v2.note(slates);
		v3.note(notebook);

		System.out.println(" ");

		Student v4 = new Student();
//		v1.note(leafs);
//		v2.note(slates);
//		v3.note(notebook);
		v4.note(laptop);

		System.out.println(" ");

		Student v5 = new Student();
//		v1.note(leafs);
//		v2.note(slates);
//		v3.note(notebook);
//		v4.note(laptop);
		v5.note(smartphones);

	}

}
