package EH;
public class ex4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
    	   //code that may raise exception
    	   int data=100/0;
       }catch(ArithmeticException e) {
    	   System.out.println(e);
       }
	finally {
	       System.out.println("rest of the code..");
}
}}