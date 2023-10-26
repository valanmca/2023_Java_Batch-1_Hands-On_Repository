package JavaOops6;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class File {
	void m1() throws ArithmeticException,FileNotFoundException  //this line helps to know that m1() method contains those follwing exceptions.
	{
		//Business logic
		
		int a=10/0;  //Exception, but the exception is handled by the method who calls the  m1() method.
		
		FileReader fr=new FileReader("Abc.txt");
	}
	void m2() {
		//Exception handling code
		try {
			m1();
		}
		catch(ArithmeticException e) {
			
		}
		catch(FileNotFoundException e) {
			
		}
		
	}
	

	public static void main(String[] args) throws FileNotFoundException {
		
//      Types of exception --> Checked, Unchecked
		
//		int a=10/0;  //Arithmetic Exception  --> Unchecked Exception
		
		FileReader fr=new FileReader("Demo.txt");  //FileNotFound Exception --> Checked Exception
		

	}

}
