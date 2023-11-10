package Day_3;

public class string_object {

	public static void main(String[] args) {
		String s1="JAVA";
		String s2=new String("JAVA");
		char ch[]= {'J','A','v','A'};
		String s4=new String(ch);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.charAt(1));
		System.out.println(s1.indexOf('A'));
		System.out.println(s1.lastIndexOf('A'));
		System.out.println(s1.length());
		System.out.println(s1.replace('A', 'Z'));
		System.out.println(s1.concat("World"));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		String s3="Java World";
		System.out.println(s3.substring(3,7)); //substring is a overloaded method
		System.out.println(s3.substring(3));
		

	}

}
