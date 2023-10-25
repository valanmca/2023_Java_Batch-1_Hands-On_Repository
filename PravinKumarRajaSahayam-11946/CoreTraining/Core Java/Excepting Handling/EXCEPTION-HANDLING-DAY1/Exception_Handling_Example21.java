//Exception Handling throwable for the try and catch blocks
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
class InvalidAgeException1 extends Throwable {
	public String toString() {
		return "Invalid Age for the Vote";
	}
}
public class Exception_Handling_Example21 {
	public static void main(String[] args) throws FileNotFoundException {
// TODO Auto-generated method stub
		System.out.println("Enter your Age : ");
		int age = new Scanner(System.in).nextInt();
		if (age >= 18) {
			System.out.println("Welcome to the Vote");
		} else {
			try {
				throw new InvalidAgeException1();
			} catch (InvalidAgeException1 e) {
				System.out.println(e);
			}
		}

		// Using throw new InvalidAgeExceptions1 I we can throw the object
	}

}

