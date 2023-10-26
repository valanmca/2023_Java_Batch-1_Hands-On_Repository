// Palindrome without using loop
package JavaBasics3;

public class Palindrome {

	public static void main(String[] args) {

		
		StringBuffer s1=new StringBuffer("MOM");
		String s3 = new String(s1);
		
		StringBuffer s2=new StringBuffer(s1.reverse());
		String s4 = new String(s2);
		
		System.out.println(s3);
		System.out.println(s4);
		
		if(s3.equals(s4)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		
		
		
		
	}

}
