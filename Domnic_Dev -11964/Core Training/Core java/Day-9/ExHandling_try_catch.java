package Core_Topic_Domnic_Day_9;

public class ExHandling_try_catch {

	public static void main(String[] args) {
		System.out.println("Before Exception");
		try {
			int a = 20 / 9;
			try {
				int b = Integer.parseInt("abc");
			} catch (NumberFormatException e) {  //if the relevant catch is not there it will come out of the nested and search outside
				System.out.println("A");
			}
		} catch (NumberFormatException e) {
			System.out.println("B");
		} catch (ArithmeticException e) {
			System.out.println("C");
		} catch (Exception e) {
			System.out.println("D");
		} finally {
			System.out.println("Finally will occur");
		}
		System.out.println("After Exception");

	}

}
