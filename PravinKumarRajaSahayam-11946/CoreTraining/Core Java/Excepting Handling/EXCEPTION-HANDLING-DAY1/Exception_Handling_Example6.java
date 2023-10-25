//Exception Handling Class Cast Exception Errors
public class Exception_Handling_Example6 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		System.out.println("Before Exception");
		Exception_Handling_Example6 o = (Exception_Handling_Example6) new Object();//We can use reverse of the Object using the (Filename or classname or Exception_Handling_Example6 or objectname))
		System.out.println("After Exception");
	}

}
