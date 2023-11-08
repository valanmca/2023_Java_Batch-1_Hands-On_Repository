package Day_3;

public class Practice {
	// == vs .equals() in java string
	public static void main(String[] args) {
		// For String comparison we should not use ==
		
		String s1 = new String("Java"); //new keyword take separate memory for each new keyword
		String s2 = new String("Java");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
		String s3 = "Java"; //literals
		String s4 = "Java"; //different variables with Same values in literals will store in same memory location

		System.out.println(s3.equals(s4));
		System.out.println(s3==s4);
	}

}
