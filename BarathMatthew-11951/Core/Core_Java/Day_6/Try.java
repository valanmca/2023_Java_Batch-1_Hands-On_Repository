package Day_6;

public class Try {

	public static void main(String[] args) {
		System.out.println("Before Exception");
		int num1 =0,num2 =0;
		try {
			try {
				int arr[] = new int[5];
			}
			catch(NegativeArraySizeException e) {
				System.out.println(e);
			}
			num2 = 10/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("After Exception");
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);

	}

}
