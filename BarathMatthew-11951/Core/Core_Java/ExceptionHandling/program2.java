package ExceptionHandling;

public class program2 {

	public static void main(String[] args) {
		int a=10,b=0;
		int c=0;
		
//		try block will get executed if there is no exception in try block.
		
		try {			
			int arr[]=null;
			System.out.println(arr[1]);	
			c = a/b; //this line will not get executed because the NullPointerException get executed 
		}
		
		catch(ArithmeticException e) {
			
			System.err.println("Error occured in program 2");
		}
		
		catch(NullPointerException e) {
			System.out.println("array value is null");
		}
		
//		The exception will get executed if any other exception occurs  
		
//		If there are multiple catch block then use the base class exception at last.
//		If we use the simply Exception at first then the remaining exception derived from base class will not get execute and show error
		catch(Exception e) {
			System.out.println("Error occured");
		}
		
		finally {
			System.out.println();
		}
		
		System.out.println(c);
		System.out.println("End of Program.");

	}

}
