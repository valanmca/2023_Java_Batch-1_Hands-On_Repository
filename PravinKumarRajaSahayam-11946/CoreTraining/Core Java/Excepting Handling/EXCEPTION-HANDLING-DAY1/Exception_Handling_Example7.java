//Exception Handling try and catch Exceptions
public class Exception_Handling_Example7 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		System.out.println("Before Exception");
		try {
			int a = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception errors" + e);
		}
		System.out.println("After Exception");
	}

}
