//Exception Handling try and catch with the multiple catch block try the next lines Exceptions
public class Exception_Handling_Example12 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		System.out.println("Before Exception");
		try {
			int a = 10 / 2;
			System.out.println("A");
			int c = Integer.parseInt("abc");
		} catch (NumberFormatException e) {
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("After Exception");
	}

}
