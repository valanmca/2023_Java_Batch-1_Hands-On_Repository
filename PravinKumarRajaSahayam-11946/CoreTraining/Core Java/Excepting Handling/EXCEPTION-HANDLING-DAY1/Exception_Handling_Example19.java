//Exception Handling throw custom Exceptions
import java.io.FileNotFoundException;
import java.io.FileReader;

class InvalidAgeException extends Exception {
	public String toString() {
		return "Invalid Age for the Vote";
	}
}

public class Exception_Handling_Example19 {
	public static void main(String[] args) throws FileNotFoundException {
// TODO Auto-generated method stub
		int age = 13;
		if (age > 18) {
			System.out.println("Welcome to the Vote");
		} else {
			try {
				throw new InvalidAgeException();
			} catch (InvalidAgeException e) {
				System.out.println(e);
			}
		}

		// Using throw new InvalidAgeException I we can throw the object
	}

}
