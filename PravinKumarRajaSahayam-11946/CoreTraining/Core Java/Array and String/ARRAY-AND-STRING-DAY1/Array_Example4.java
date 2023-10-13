//String are Immutable Objects in Java
public class Array_Example4 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		String s1 = "Java";
		s1.concat(" World ");
		System.out.println(s1);// Java

		String s9 = "Java";
		s9 = s9.concat(" World ");
		// s9.concat(" WORLD "); It will be add the the values for the another memory
		// and stored in the some other memory then it is automatically delete from the
		// help of the garbage method
		System.out.println(s9);// Java World

		String s5 = "Java";
		s5 = s5.toUpperCase();
		// s5.toUpperCase(); It will be change the values JAVA to the UpeerCase and
		// storeed in the unreference memory and it is automatically delete by the use
		// of the garbage OUTPUT : - java for the System.out.println(s5)
		System.out.println(s5);// JAVA
	}

}