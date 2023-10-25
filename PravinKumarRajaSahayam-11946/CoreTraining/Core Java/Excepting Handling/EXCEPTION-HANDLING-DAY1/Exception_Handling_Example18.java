//Exception Handling throws Errors Exceptions
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception_Handling_Example18 {
	void m1() throws ArithmeticException, FileNotFoundException {
		// BL
		int a = 10 / 0;
		FileReader frs = new FileReader("Abc.txt");
	}

	void m23() {
		// EHC
		try {
			m1();
		} catch (ArithmeticException e) {

		} catch (FileNotFoundException e) {

		}
	}

	public static void main(String[] args) throws FileNotFoundException {
// TODO Auto-generated method stub
		int a = 10 / 0; // Arithmetic Exception Errors - (unchecked Exception)
		FileReader frs = new FileReader("Demo.txt"); // File Not Founds Exceptions Errors - (checked Exception)

	}

}