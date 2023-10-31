package EHDay1;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Before Exception");
	    try  {
		int a=10 / 2;
      try {
	    int b =Integer.parseInt("abc");
	   }
	    catch(ArithmeticException e) {
	    	System.out.println("A");	
	    }}
        catch(NumberFormatException e) {
	    	System.out.println("c");
	    	 }
	    catch(Exception e) {
	    	System.out.println("D");	
	   } finally {
		   System.out.println("Finally");
	   }
		System.out.println("After Exception");

	}

}
