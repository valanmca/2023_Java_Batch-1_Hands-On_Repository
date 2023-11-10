package Day_8;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class throwskeyword {
	void m1() throws ArithmeticException, FileNotFoundException {
		int a=10/0;
		FileReader fr=new FileReader("abc.txt");
	}
	void m2() {
		try {
			m1();
		}
		catch(ArithmeticException e) {
			
		}
		catch(FileNotFoundException e) {
			
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		
		FileReader fr=new FileReader("Demo.txt");   //FileNotFoundException -Checked Exception

	}

}
