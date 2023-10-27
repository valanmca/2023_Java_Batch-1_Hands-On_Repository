package com.dharshu.day9;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	int id;
	String name;
	float salary;
	
	Employee (int id, String name, float salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	void display() {
		System.out.println("Employee Id:"+id);
		System.out.println("Employee Name:"+name);
		System.out.println("Employee Salary:"+salary);
	}
}
public class Ex_4_Emp_Serialization {
	public static void main(String[] args) throws IOException {
		
		// Serialization
		Employee emp1=new Employee (101,"Dharshu",2000.0f);
		
		//creating a new file for writing purpose
		FileOutputStream fout = new FileOutputStream("D:/ObjectFile.txt"); //normal txt file
		
		// converting normal txt file into Object writable file because The file should support binary data).
		ObjectOutputStream objout = new ObjectOutputStream(fout);
		
		objout.writeObject(emp1);
		
		//closing 
		objout.close();
		fout.close();	
		System.out.println("Object Saved");
	}
}
