package com.gayathri.day10Files;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

//to store the object file permenently
class Employee implements Serializable {
	int eId;
	String eName;
	float eSalary;

	public Employee(int eId, String eName, float eSalary) {
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
	}

	void display() {
		System.out.println("ID : " + eId);
		System.out.println("Name : " + eName);
		System.out.println("Salary : " + eSalary);

	}

}

public class Ex4Serialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// Serialization
		Employee obj = new Employee(11954, "Gayathri", 10000.0f);

		FileOutputStream fos = new FileOutputStream("D:/Core Java/ObjectFile.txt");

		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		oos.close();

		fos.close();

	
	}
}