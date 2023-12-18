package com.jeban.Day9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
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
		System.out.println("Employee Id:" + id);
		System.out.println("Employee Name:" + name);
		System.out.println("Employee salary:" + salary);
	}

}

public class Mysynchronizatio3 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// Serialization
		Employee emp1 = new Employee(101, "Jeban", 10000.0f);
		Employee emp2 = new Employee(102, "Ignesh", 20000.0f);
		FileOutputStream fout = new FileOutputStream("D:\\JavaFiles/ObjectFile.txt");
		ObjectOutputStream objout = new ObjectOutputStream(fout);
		objout.writeObject(emp1);
		objout.writeObject(emp2);
		
		objout.close();
		fout.close();
		System.out.println("Object Saved");

		// De-Serialization
		FileInputStream fin = new FileInputStream("D:\\JavaFiles/ObjectFile.txt");
		ObjectInputStream objin = new ObjectInputStream(fin);
		Employee emp3 = (Employee) objin.readObject();
		objin.close();
		fin.close();

		emp3.display();
	}

}
