package Day_6;
//Used in certain situations like during server down to indicate a problem before happening.
// In a certain time the application may face different or unknown error at the time.
//the file have to be saved first and some things has to be done before crash that thing should be coded inside Finally.

public class WorkOfFinallyKeyWord {
	public static void main(String[] args) {
		int a=10,b=0;
		int c=0;
		try {			
	
			throw new Error();
			
		}
		catch(ArithmeticException e) {
			
			System.err.println("Error occured because of ArithmeticException");
		}
		catch(NullPointerException e) {
			System.out.println("array value is null");
		}
		catch(Exception e) {
			System.out.println("Error occured");
		}
		finally {
			System.out.println("Finally get executed");
		}	
		System.out.println(c);
		System.out.println("End of Program.");
	}
}
