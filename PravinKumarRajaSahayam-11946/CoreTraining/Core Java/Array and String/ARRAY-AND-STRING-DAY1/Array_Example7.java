//Palindrome Program using String Buffer
public class Array_Example7 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		String stringbuffer = "anna";
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
