package JavaOops6;

public class Finally {

	public static void main(String[] args) {

		System.out.println("Before exception");
		try {
			int a=10/0;
		}
		catch(NumberFormatException e){  //It won't execute.
			System.out.println(e);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally");
		}
		
		System.out.println("After exception");

	}

}
