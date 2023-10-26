// (== vs equals ) method in string comparison
package JavaBasics3;

public class String1 {
	
	
	public static void main(String[] args) {

		String s1=new String("Java");  //new keyword can create two different memory s1,s2
		String s2=new String("Java");

		//String Comparison using equals operator
		System.out.println(s1.equals(s2));  //True
		
		//Should not use (==) operator to compare two strings (== will check the memory location)
		System.out.println(s1==s2);  // False
		
		
		String s3="Java"; // different variables with same values in literals  will store in same memory location (s4 also points to s3)
		String s4="Java"; 
		System.out.println(s3.equals(s4));  //True
		System.out.println(s3==s4);  //True

	}

}
