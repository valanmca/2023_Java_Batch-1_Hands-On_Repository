package JavaOops6;

public class NestedTry {

	public static void main(String[] args) {

		System.out.println("Before exception"); //1
		try {
			int a=10/2;
			//If exception handled in inner try ,it will first check in inne catch block, it not available yhen it will look for outer catch block.
			try {
				int b=Integer.parseInt("abc");
			}
			catch(ArithmeticException e) {
				System.out.println(e);   //2
			}
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
			System.out.println("Finally");  //3
		}
		
		System.out.println("After exception");  //4
	}

}
