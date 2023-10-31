package EHDay1;
//Keywords -try, catch
public class ex1 {
	public static void main(String[] args) {
    System.out.println("Before Exception");
    try  {
	int a=10/0;
	int b=Integer.parseInt("abc");
	
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
