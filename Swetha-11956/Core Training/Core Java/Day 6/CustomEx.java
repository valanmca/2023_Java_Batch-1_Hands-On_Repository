package JavaOops6;
import java.util.Scanner;
//Exception- Predefined class

//throw -keyword to throw any type of exception object.
//BY default, all user defined exceptions are checked.


class InvalidAgeException extends Exception{
	// to assign some meaningful name to ur obj
	public String toString() {
		return "Invalid age for vote";
	}
}
public class CustomEx {

	public static void main(String[] args) {

		System.out.println("Enter your age");
		int age=new Scanner(System.in).nextInt();
		
		if(age>18) {
			System.out.println("Welcome to vote");
		}
		else {
			try {
				throw new InvalidAgeException();
				
			}
			catch(InvalidAgeException e) {
				System.out.println(e);
			}
		}
	}

}
