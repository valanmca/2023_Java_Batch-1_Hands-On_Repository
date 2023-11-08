package Day_3;

public class string_object {
	//topic : String Class Method
	public static void main(String[] args) {
		
		//Multiple way of declaring
		//String is a overloaded method
		
		String p1 = "Practice";
		String p2 = new String("practice");
		char ch[] = {'p','r','a','c','t','i','c','e'};
		String p3 = new String(ch);
		
		
		String s1 = "Java";
		String s2 = "java";
		
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equalsIgnoreCase(s2));//true
		System.out.println(s1.charAt(1));//a
		System.out.println(s1.indexOf('a'));//1
		System.out.println(s1.lastIndexOf('a'));//3
		System.out.println(s1.length());//4
		System.out.println(s1.replace('a', 'z'));  //Jzvz
		System.out.println(s1.concat("World")); //JavaWorld
		System.out.println(s1.toUpperCase());// JAVA
		System.out.println(s1.toLowerCase());// java
		
		String s3 = "Java World";
		System.out.println(s3.substring(3,7));//a Wo
		System.out.println(s3.substring(3)); //a World
	}

}
