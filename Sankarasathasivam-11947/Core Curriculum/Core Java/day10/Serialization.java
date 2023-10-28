package com.shiva.core.day10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
	transient int id;
	String name;
	float salary;

	Employee(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	void display() {
		System.out.println("Employee Id : " + id);
		System.out.println("Employee Name : " + name);
		System.out.println("Salary : " + salary);
	}
}

public class Serialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// Serialization
		Employee emp1 = new Employee(11947, "Shiva", 1300.0f);

		FileOutputStream fout = new FileOutputStream("F:/ObjectFile.txt");
		ObjectOutputStream Objout = new ObjectOutputStream(fout);

		Objout.writeObject(emp1);
		Objout.close();
		fout.close();

		System.out.println("Object Saved");

		// Deserialization
		FileInputStream fin = new FileInputStream("F:/ObjectFile.txt");
		ObjectInputStream Objin = new ObjectInputStream(fin);

		Employee emp2 = (Employee) Objin.readObject();

		Objin.close();
		fin.close();

		emp2.display();
	}

}
