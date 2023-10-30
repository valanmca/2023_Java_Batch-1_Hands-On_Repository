//Example for Serialization and De-serialization
package com.sara.CoreJava.Day_10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	int Emp_Id;
	String Emp_Name;
	float Emp_Salary;
	
Employee(int Emp_Id,String Emp_Name,float Emp_Salary){
	this.Emp_Id = Emp_Id;
	this.Emp_Name = Emp_Name;
	this.Emp_Salary = Emp_Salary;
}

void display() {
	System.out.println("Employee Id : "+Emp_Id);
	System.out.println("Employee Name : "+Emp_Name);
	System.out.println("Employee Salary : "+Emp_Salary);
}
}

public class FileHandling_Ex04 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//Serialization
		
		Employee emp1 = new Employee(18,"Sara",14000);
		FileOutputStream fileout = new FileOutputStream("D:/Object_File.txt");
		ObjectOutputStream objout = new ObjectOutputStream(fileout);
		objout.writeObject(emp1);
		objout.close();
		fileout.close();
		System.out.println("Object Saved...");
		
		//De-serialization
		FileInputStream filein = new FileInputStream("D:/Object_File.txt");
		ObjectInputStream objin = new ObjectInputStream(filein);
		Employee emp2 = (Employee) objin.readObject();
		objin.close();
		filein.close();
		
		emp2.display();
		
	}

}
