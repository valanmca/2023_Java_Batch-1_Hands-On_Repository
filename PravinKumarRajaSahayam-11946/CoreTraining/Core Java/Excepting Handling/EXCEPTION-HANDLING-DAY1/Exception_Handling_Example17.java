//Exception Handling nested try and catch Exceptions
public class Exception_Handling_Example17 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		System.out.println("Before Exception");
		try {
			int a = 10 / 2; // Once the Exception is founds it will go the catch without go remaining try
							// without go another blocks
			try {
				int b = Integer.parseInt("abc");
			} catch (ArithmeticException e) { // The Exception is founds for the outer Exception it will go the that
												// Exception for the founds catch blocks
				System.out.println("A");
			}
		} catch (NumberFormatException e) { //It will see the inner and outer catch blocks
			System.out.println("B");
		} catch (ArithmeticException e) {
			System.out.println("C");
		} catch (Exception e) {
			System.out.println("D");
		} finally {
			System.out.println("Finally");
		}
		System.out.println("After Exception");
	}

}
