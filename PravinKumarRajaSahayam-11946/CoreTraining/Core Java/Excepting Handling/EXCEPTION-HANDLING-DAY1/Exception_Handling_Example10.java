//Exception Handling try and catch with the multiple catch block Exceptions
public class Exception_Handling_Example10 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		System.out.println("Before Exception");
		try {
			int a = 10 / 0;
			System.out.println("A");
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
