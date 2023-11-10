package Day_8;

public class TryCatch {

	public static void main(String[] args) {
		System.out.println("Before Exception");
		try {
			int a=10/0;        
			System.out.println(a);  //it may not be look for next line of the try block , if the exception is occured in the first line
		}
		catch (ArithmeticException e){  //order catch must be subtype to supertype
			System.out.println(e);
		}
		
		System.out.println("After Exception");

	}

}
