package Day_8;

public class NestedTryCatch {

	public static void main(String[] args) {
		System.out.println("Before Exception");
		try {
			int a=10/0;        
			try {
				int b= Integer.parseInt("abc");
			}
			catch(NumberFormatException e) {
				System.out.println(e);
			}
		}
			
		catch (NumberFormatException e){  
			System.out.println(e);
		}
		catch (ArithmeticException e){  
			System.out.println(e);
		}
		catch (Exception e){  
			System.out.println(e);
		}
		
		
		System.out.println("After Exception");

	}

	

}
