package EH;
public class ex2 {
	static void checkAge(int age) {
		if(age>18) {
			System.out.println("Access is not defined");
			throw new ArithmeticException("Access defined-You must be 18 year old");
		}
		else {
			System.out.println("Access is Valided");
		}
	}
	public static void main(String[] args) {
		checkAge(20);
	}
}

