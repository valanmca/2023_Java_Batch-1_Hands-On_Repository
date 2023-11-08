package ExceptionHandling;

//Use multiple Exception in single catch using OR(|)

public class Program5 {

	public static void main(String[] args) {
		
		int a=10,b=0;
		int c=0;
		try {			
			int arr[]=null;
			System.out.println(arr[1]);	
			c = a/b; //this line will not get executed because the NullPointerException get executed 
		}
		
		catch(ArithmeticException |NullPointerException e) {
			
			System.err.println("Error occured in program 5 it may be arithmetic or null pointer");
		}
		
//		catch(NullPointerException e) {
//			System.out.println("array value is null");
//		}
		
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
