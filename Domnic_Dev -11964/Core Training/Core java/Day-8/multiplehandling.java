package Core_Topic_Domnic_Day_8;

public class multiplehandling {

	public static void main(String[] args) {
		int a=24;
		int b=0;
		int c=0;
		try {
			 
			 c=a/b;
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception ");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException ");
		} catch (Exception e) {
			System.out.println("Exception Class");
		}
		System.out.println(c);
	}
}
