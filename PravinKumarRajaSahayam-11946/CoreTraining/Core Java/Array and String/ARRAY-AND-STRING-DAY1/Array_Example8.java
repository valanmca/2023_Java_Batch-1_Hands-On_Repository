//Palindrome Program using String Buffer take the user inputs
import java.util.Scanner;
public class Array_Example8 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String stringbuffer;
		System.out.println("Enter the String : ");
		stringbuffer = sc.next();
		StringBuffer buffer = new StringBuffer(stringbuffer);
		buffer.reverse();
		String data = buffer.toString();
		if (stringbuffer.equals(data)) {
			System.out.println("The given string is the Palindrome");
		} else {
			System.out.println("The given string is not a Palindrome");
		}
	}
}





