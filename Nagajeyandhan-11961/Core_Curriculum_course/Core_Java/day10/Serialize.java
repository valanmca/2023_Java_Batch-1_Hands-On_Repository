package com.jeyandhan.day10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

 class Employee implements Serializable{
	transient int id;
	String name;
	float salary;
	
	Employee(int id, String name, float salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	void disp() {
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
	}
}

public class Serialize {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Employee emp1 = new Employee(11, "Jeyandhan", 20000.0f);
		
		
		FileOutputStream fout = new FileOutputStream("D:/ObjectFile.txt");
		
		ObjectOutputStream objout = new ObjectOutputStream(fout);
		
		objout.writeObject(emp1);
		objout.close();
		fout.close();
		
		//deserialization
		
FileInputStream fin = new FileInputStream("D:/ObjectFile.txt");
		
		ObjectInputStream objin = new ObjectInputStream(fin);
		
		Employee emp2 = (Employee) objin.readObject();
		objin.close();
		fin.close();
		System.out.println("Object Saved");
		emp2.disp();
		System.out.println("Object Saved");
		
		
		
	}

}
