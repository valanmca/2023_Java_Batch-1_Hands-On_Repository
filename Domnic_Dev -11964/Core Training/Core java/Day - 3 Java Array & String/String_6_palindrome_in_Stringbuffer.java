package Core_Topic_Domnic_Day_3;
import java.util.Scanner;
public class String_6_palindrome_in_Stringbuffer {

public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the word");
	String s1=sc.next();
	  
	StringBuffer sb=new StringBuffer(s1);
	
	sb.reverse();
	
	String s2=sb.toString();
	System.out.println(s2);
	if(s1.equalsIgnoreCase(s2)) {
		System.out.println("The Word is palindrome");
	}
	else {
		System.out.println("The Word is not a palindrome");

	}
	
}

}
