package ExceptionHandling;

public class program1 {

	public static void main(String[] args) {
		
		int a=10,b=0;
		int c=0;
		
		try {
		c = a/b;
		}
		
		catch(Exception e) {
//			System.out.println("Error occured");
			System.err.println("Error occured");
		}
		
		System.out.println(c);
		System.out.println("End of Program.");
	}

}
