package EHDay1;

public class ex2 {

	public static void main(String[] args) {
		System.out.println("Before Exception");
	    try  {
          throw new Error();		
	   }
	    catch(NumberFormatException e) {
	    	System.out.println(e);	
	    }
	    catch(ArithmeticException e) {
	    	System.out.println(e);
	    	 }
	    catch(Exception e) {
	    	System.out.println(e);	
	   }finally {
		   System.out.println("Finally");
	   }
		System.out.println("After Exception");
	}

}
