package Day_3;

public class practise {
	
	//== vs equals method in java string

	public static void main(String[] args) {
		String s1=new String("java"); //new keyword take separate memory for each new keyword
		String s2=new String("java");
		
		System.out.println(s1.equals(s2)); //For string comparison use equals method
		System.out.println(s1==s2); // For string should not use double equal operator
		
		String s3="java"; //literals
		String s4="java";	
		
		System.out.println(s3.equals(s4)); //different variables with Same values in literals will store in same memory location
		System.out.println(s3==s4);
		
		StringBuffer s5=new StringBuffer("java"); 
		StringBuffer s6=new StringBuffer("java");
		
		System.out.println(s5.equals(s6));
		System.out.println(s5==s6); 

	}

}
