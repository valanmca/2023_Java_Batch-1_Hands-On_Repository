package com.madhan.coreday09;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable
{
	transient int id; // Transient keyword helps  not to serialize a particular object.
	transient String name;
	float salary;
	
	Employee(int id,String name,float salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	void display()
	{
		System.out.println("Employee Id:" +id);
		System.out.println("Employee Name:" +name);
		System.out.println("Employee Salary:" +salary);

	}
}

public class SerializationEx1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee emp=new Employee(1,"Madhan",10000.0f);
		FileOutputStream fout=new FileOutputStream("D:/ObjectFile.txt");
		ObjectOutputStream objout=new ObjectOutputStream(fout);
		objout.writeObject(emp);
		objout.close();
		fout.close();
		System.out.println("Object Saved");
		
		//de-Serialization
		
//		FileInputStream fin=new FileInputStream("D:/ObjectFile.txt");
//		ObjectInputStream objin=new ObjectInputStream(fin);
//		Employee emp2=(Employee) objin.readObject();
//		objin.close();
//		fin.close();
		
//		emp2.display();
	}

}
