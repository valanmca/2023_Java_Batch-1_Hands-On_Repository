package JavaOops6;
//
public class ExcepHandle {

	public static void main(String[] args) {

//		int arr[]= {1,2,3};   -----------> ArrayIndexOutOfBoundException
//		System.out.println(arr[3]);
		
//		int a=Integer.parseInt("abc"); -------> NUmberFormatException
//		System.out.println("After exception");
		
//		int arr[]=new int[-4];  -----------> NegativeArraySizeException
//		System.out.println("after exception");
		
		ExcepHandle obj=(ExcepHandle) new Object(); //----> ClassCastException 
		System.out.println("After Exception");
	
		
//		try {
//			int a=10/0;
//		}
//		catch(ArithmeticException e) {
//			System.out.println(e);
//		}
//		System.out.println("After exception");
		
	}

}
