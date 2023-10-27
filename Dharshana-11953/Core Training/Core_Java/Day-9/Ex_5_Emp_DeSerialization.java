package com.dharshu.day9;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee1 implements Serializable{
	transient int id;
	String name;
	float salary;
	
	Employee1 (int id, String name, float salary){
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
public class Ex_5_Emp_DeSerialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// Serialization
				Employee1 emp1=new Employee1 (102,"Minion",2000.0f);		
				FileOutputStream fout = new FileOutputStream("D:/ObjectFile.txt"); //normal txt file			
				ObjectOutputStream objout = new ObjectOutputStream(fout);
				objout.writeObject(emp1);
				objout.close();
				fout.close();	
				System.out.println("Object Saved");		
		//De-Serialization
				FileInputStream fin = new FileInputStream("D:/ObjectFile.txt");
				ObjectInputStream objin = new ObjectInputStream(fin);
				Employee1 emp2= (Employee1) objin.readObject();
				emp2.display();
				objin.close();
				fin.close();
	}
}
