//Exception Handling try and catch Exceptions
public class Exception_Handling_Example9 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		System.out.println("Before Exception");
		try {
			int a = 10 / 0;
			System.out.println("A");
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("After Exception");
	}

}
