package com.core.day_08;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Employee  implements Serializable{
	 transient int id ;
	String name;
	float salary;
	
	
	Employee(int id ,String name,float salary)
	{
		 this.id=id;
		 this.name=name;
		 this.salary=salary;
	}
	
	void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		
	}
}

public class Serialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		// Serialization
		Employee emp=new Employee (101,"Aravind ",2000.f);
		
		FileOutputStream file_write=new  FileOutputStream("D:/File handling/object.txt");
		
		
		ObjectOutputStream obj=new  ObjectOutputStream(file_write); // converting normal txt file as object writable one 
		
		obj.writeObject(emp); // saving object into file 
		
		obj.close();
		file_write.close();

        System.out.println("object saved");
        
        //De-serialization
        
        FileInputStream fin =new  FileInputStream("D:/File handling/object.txt");
        ObjectInputStream obj1=new  ObjectInputStream(fin);
        Employee emp2=(Employee) obj1.readObject();
        obj1.close();
        fin.close();
        emp2.display();
        
        
        
        
		
	}

}
