package Day_8;

public class Finally {

	public static void main(String[] args) {
		System.out.println("Before Exception");
		try {
			int a=10/0;        
			 
		}
		catch (ArithmeticException e){  
			System.out.println(e);
		}
		finally {
			System.out.println("Finally");
		}
		
		System.out.println("After Exception");

	}


	}


