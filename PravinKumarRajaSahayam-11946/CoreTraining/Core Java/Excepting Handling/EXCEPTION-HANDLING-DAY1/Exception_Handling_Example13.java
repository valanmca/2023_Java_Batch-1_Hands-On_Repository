//Exception Handling Finally Exceptions
public class Exception_Handling_Example13 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		System.out.println("Before Exception");
		try {
			int a = 10 / 0;
			System.out.println("A");
			int b = Integer.parseInt("abc");
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
