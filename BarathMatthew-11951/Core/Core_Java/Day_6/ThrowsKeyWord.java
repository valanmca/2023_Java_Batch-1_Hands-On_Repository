package Day_6;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsKeyWord {
	
	void m1() throws ArithmeticException, FileNotFoundException{
		int a = 10/0;
		FileReader fr = new FileReader("Abc.txt");
	}
	
	void m2() {
		try {
			m1();
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}
		catch(FileNotFoundException e) {
			System.out.println("File Not Found Exception");
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		ThrowsKeyWord throwsKeyWord = new ThrowsKeyWord();
		throwsKeyWord.m2();
//		FileReader fr = new FileReader("Demo.txt");
		

	}

}
