//Exception Handling Finally without the corrects try for the catch Exceptions
public class Exception_Handling_Example14 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		System.out.println("Before Exception");
		try {
			throw new Error();
		} catch (NumberFormatException e) {
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Finally");
		}
		System.out.println("After Exception");
	}

}
