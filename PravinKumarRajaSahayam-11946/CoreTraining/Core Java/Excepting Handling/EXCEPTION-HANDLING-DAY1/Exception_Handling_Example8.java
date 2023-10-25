//Exception Handling try and catch Exceptions without proper Exceptions errors declares
public class Exception_Handling_Example8 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		System.out.println("Before Exception");
		try {
			int a = 10 / 0;
			System.out.println("A");
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		System.out.println("After Exception");
	}

}
