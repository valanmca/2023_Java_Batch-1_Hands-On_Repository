package oops9;

public class Mainclass {

	int b=20;  // Instance or Object variable //it has default value

	static int c=10; // Static or Class variable //it has default value

	public static void main(String[] args) {
		int a=30; // Local variable // no default value for local variable
		System.out.println(a);

		// calling Instance variable with the help of object
		Mainclass obj = new Mainclass();
		System.out.println(obj.b);

		/// three methods to calling static variable 
		//static variable take single memory
		System.out.println(Mainclass.c);// with the help of class .... this is the correct way to call static
		System.out.println(obj.c);// with the help of the object
		System.out.println(c);// calling with variable name itself
	}

}
