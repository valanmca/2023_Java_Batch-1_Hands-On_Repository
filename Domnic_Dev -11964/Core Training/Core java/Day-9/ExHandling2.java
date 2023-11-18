package Core_Topic_Domnic_Day_9;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExHandling2 {

	void m1()throws ArithmeticException,FileNotFoundException{
		//Business Logic
		int a=10/0;
		FileReader fr = new FileReader("Abc.txt"); 
	}
	void m2() {
		//Exception handling code
		try {
			m1();
		}catch(ArithmeticException e){
			System.out.println(e);
		}catch(FileNotFoundException e){
			System.out.println(e);

		}
	}
	public static void main(String[] args) throws FileNotFoundException {
		//int a = 10 / 2; // Arithmetic Exception - UnChecked Exception
		ExHandling2 obj=new ExHandling2();
		obj.m2();
		FileReader fr = new FileReader("Demo.txt"); // File not found exception - Checked Exception
		
	}

}
