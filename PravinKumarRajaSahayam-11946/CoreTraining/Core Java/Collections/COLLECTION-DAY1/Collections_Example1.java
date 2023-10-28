//Collections converts primitive values for the object with different types of JDK Versions Syntax
public class Collections_Example1 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		int a = 10; // Primitive
//Converts Primitive values into a Object
//JDK 1.4 Versions Syntax
		Integer obj1 = new Integer(a); // Boxing
		int b = obj1.intValue(); // Un-Boxing
//JDK 1.5 Versions Syntax
		Integer obj2 = a; // Auto-Boxing
		int c = obj2; // Auto-Un-Boxing
	}

}