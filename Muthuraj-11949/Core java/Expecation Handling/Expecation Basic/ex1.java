package EH;

public class ex1 {
	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub
		try {
			int[] myNumbers= {1,2,3,4};
			System.out.println(myNumbers[2]);	
	}
		catch (Exception e) {
		System.out.println("Something went wrong");
	}
		finally {
		System.out.println("The 'try catch' is finished.");
	}
}
}
