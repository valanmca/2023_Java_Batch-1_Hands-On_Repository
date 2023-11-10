package Day_10;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee1 implements Serializable{
	int id;
	String name;
	float salary;
	
	Employee1(int id, String name, float salary){
		this.id=id;
		this.name=name;
		this.salary=salary;	}
	void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		
	}
}

public class deserializationn {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee1 emp1=new Employee1(101,"Hephzi",200000.0f);
		FileOutputStream fout=new FileOutputStream("D:/object.txt");
		ObjectOutputStream objout=new ObjectOutputStream(fout);
		objout.writeObject(emp1);
		objout.close();
		fout.close();
		System.out.println("Object Saved");
		
		
		FileInputStream fin=new FileInputStream("D:/object.txt");
		ObjectInputStream objin=new ObjectInputStream(fin);
		Employee1 emp2=(Employee1) objin.readObject();
		objin.close();
		fin.close();
		
		emp2.display();
		

	

	}

}
