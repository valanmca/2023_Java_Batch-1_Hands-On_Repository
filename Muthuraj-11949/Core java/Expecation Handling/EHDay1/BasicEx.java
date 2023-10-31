package EHDay1;
//java.lang.ClassCastException
public class BasicEx {

	public static void main(String[] args) {

		
		 System.out.println("Before Exception"); 
			
        BasicEx obj=(BasicEx)	new Object();	  
		System.out.println("After Excpetion");
		 
	}

}
