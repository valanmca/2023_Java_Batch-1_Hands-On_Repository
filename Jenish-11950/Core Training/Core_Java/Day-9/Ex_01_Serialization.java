package com.jenish.day09;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable { //Using Serializable for accessing other class to combine
	int id;
	String name;
	float salary;
	
	Employee(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	void display() {
		System.out.println("Employee id:" +id);
		System.out.println("Employee name:" +name);
		System.out.println("Employee salary:" +salary);
	}
}

public class Ex_01_Serialization {

	public static void main(String[] args) throws IOException {
		//Serialiation
		Employee emp1 = new Employee(101, "Jenish", 40000.0f);
		FileOutputStream fout = new FileOutputStream("D:/ObjectFile.txt");
		ObjectOutputStream objout = new ObjectOutputStream(fout);
		objout.writeObject(emp1);
		objout.close();
		fout.close();
		System.out.println("Object Saved");
	}

}
