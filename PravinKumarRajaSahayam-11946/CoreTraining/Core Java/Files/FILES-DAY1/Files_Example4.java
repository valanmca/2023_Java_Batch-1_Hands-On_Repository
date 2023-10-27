//Files for the serialization
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
	int Id;
	String Name;
	float Salary;

	Employee(int Id, String Name, float Salary) {
		this.Id = Id;
		this.Name = Name;
		this.Salary = Salary;
	}

	void display() {
		System.out.println("Employee Id is : " + Id);
		System.out.println("Employee Name is : " + Name);
		System.out.println("Employee Salary is : " + Salary);
	}
}

public class Files_Example4 {
	public static void main(String[] args) throws IOException {
// TODO Auto-generated method stub
//Serialization
		Employee obj = new Employee(101, "PravinKumar RajaSahayam", 123.45f);
		FileOutputStream fws = new FileOutputStream("D:/Object.txt"); // Create a new files
		ObjectOutputStream objout = new ObjectOutputStream(fws); // The files text files convert into the object
																	// writable one files
		objout.writeObject(obj);
		objout.close();
		fws.close();
		System.out.println("The Object is Saved");
	}

}
