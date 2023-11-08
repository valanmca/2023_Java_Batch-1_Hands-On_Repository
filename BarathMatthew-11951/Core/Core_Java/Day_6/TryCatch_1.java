package Day_6;

public class TryCatch_1 {

	public static void main(String[] args) {
		
		System.out.println("Before Exception");
		try {
			int a =10/0;
//			The below code will not get execute 
			System.out.println("A");
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("After Exception");

	}

}
