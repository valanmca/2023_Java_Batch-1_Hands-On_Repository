//Exception Handling throw custom Exceptions take the input from the users
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
class InvalidAgeExceptions extends Exception {
	public String toString() {
		return "Invalid Age for the Vote";
	}
}
public class Exception_Handling_Example20 {
	public static void main(String[] args) throws FileNotFoundException {
// TODO Auto-generated method stub
		System.out.println("Enter your Age : ");
		int age = new Scanner(System.in).nextInt();
		if (age >= 18) {
			System.out.println("Welcome to the Vote");
		} else {
			try {
				throw new InvalidAgeExceptions();
			} catch (InvalidAgeExceptions e) {
				System.out.println(e);
			}
		}

		// Using throw new InvalidAgeExceptions I we can throw the object
	}

}

