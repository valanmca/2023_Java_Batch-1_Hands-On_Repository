package com.jenish.day09;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee1 implements Serializable { // Using Serializable for accessing other class to combine.
	transient int id;  //To stop the Serialization for particular feild
	String name;
	float salary;

	Employee1(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	void display() {
		System.out.println("Employee id:" + id);
		System.out.println("Employee name:" + name);
		System.out.println("Employee salary:" + salary);
	}
}

public class Ex_03_Transient {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

			// Serialiation
			Employee1 emp1 = new Employee1(101, "Jeni", 40000.0f);
			FileOutputStream fout = new FileOutputStream("D:/ObjectFile.txt");
			ObjectOutputStream objout = new ObjectOutputStream(fout);
			objout.writeObject(emp1);
			objout.close();
			fout.close();
			System.out.println("Object Saved");

			// De-Serialiation
			FileInputStream fin = new FileInputStream("D:/ObjectFile.txt");
			ObjectInputStream objin = new ObjectInputStream(fin);
			Employee1 emp2 = (Employee1) objin.readObject();
			objin.close();
			fin.close();
			emp2.display();

	}

}
