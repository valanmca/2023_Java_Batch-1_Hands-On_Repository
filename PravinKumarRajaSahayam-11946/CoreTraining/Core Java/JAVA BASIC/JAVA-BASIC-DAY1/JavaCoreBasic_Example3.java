public class JavaCoreBasic_Example3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Commands Lines Arguments convert string from ints and add the number 2 or 3
		// numbers
		String number1;
		String number2;
		String number3;
		System.out.println("Arguments 1" + " " + args[0]);
		System.out.println("Arguments 2" + " " + args[1]);
		System.out.println("Arguments 3" + " " + args[2]);
		number1 = args[0];
		number2 = args[1];
		number3 = args[2];
		int i = Integer.parseInt(args[0]);
		int h = Integer.parseInt(args[1]);
		int s = Integer.parseInt(args[2]);
		System.out.println("Addition of the 3 numbers is : " + " " + (i + h + s));
	}
}




