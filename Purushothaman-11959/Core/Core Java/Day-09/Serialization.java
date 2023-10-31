package com.purushoth.day_09;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Employee implements Serializable{
	transient int id; //transient to make the variable can't serializable.
	String name;
	float salary;

	Employee(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	void display() {
		System.out.println("Employee id : " + id);
		System.out.println("Employee name: " + name);
		System.out.println("Employee salary: " + salary);
	}
}

public class Serialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// Serialization
		Employee emp1 = new Employee(101, "Steve", 25000.0f);
		FileOutputStream fout = new FileOutputStream("D:/EmpObject.txt"); // To write.
		ObjectOutputStream objout = new ObjectOutputStream(fout); // Text to Object writable one.

		objout.writeObject(emp1); // To write object.
		objout.close();
		fout.close();
		System.out.println("Object Saved");
		
		//De-Serialization
		FileInputStream fin=new FileInputStream("D:/EmpObject.txt");
		ObjectInputStream objin = new ObjectInputStream(fin);
		Employee emp2=(Employee) objin.readObject();
		objin.close();
		fin.close();
		
		emp2.display();

	}

}
