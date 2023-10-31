package EHDay3;
/// Serialization

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	transient int id;/// Particular stop in used Keyword transient in Ser
	String name;
	float salary;
	
	Employee(int id,String name,float salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
		

		
	}
	void display() {
		System.out.println("Employee id:"+id);
		System.out.println("Employee name:"+name);
		System.out.println("Employee salary:"+salary);
	}
}
public class ex2 {
	public static void main(String[] args) throws IOException, ClassNotFoundException  {	
		//Serialization
		Employee emp1=new Employee(101,"muthuraj",2000.0f);
		FileOutputStream fout=new FileOutputStream("D.ObjectFile.txt");
		ObjectOutputStream object=new ObjectOutputStream(fout);
		object.writeObject(emp1);
		object.close();
		fout.close();
		System.out.println("Object Saved");
		
		
		///Deserializtaion
		FileInputStream fin=new FileInputStream("D.objectFile.txt");
		ObjectInputStream objin=new ObjectInputStream(fin);
		Employee emp2=(Employee) objin.readObject();
		objin.close();
		fin.close();
		emp2.display();

	}

}
