package JavaBasics3;


public class StringEx {

	public static void main(String[] args) {

		String s1="Java";
		String s2="java";
		
//		String s3 = new String("Java");
//		char ch[] = {'J', 'a', 'v', 'a'};
//		String s4 = new String(ch);
//		System.out.println(s3);
		
		System.out.println(s1.equals(s2));  //false
		
		System.out.println(s1.equalsIgnoreCase(s2));  //True
		
		System.out.println(s1.charAt(1)); //a --> returns the character at index 1 in s1.
		
		System.out.println(s1.indexOf('a')); // 1 --> returns the index of a in s1.
		
		System.out.println(s1.lastIndexOf('a')); //3 --> returns the index of last occurance of a in s1.
		
		System.out.println(s1.length()); //4
		
		System.out.println(s1.replace('a', 'z')); //Jzvz  --> replace the letter  with z in s1.
		
		System.out.println(s1.concat(" world")); //concatenate world with s1.
		
		System.out.println(s1.toUpperCase());  //JAVA
		
		System.out.println(s1.toLowerCase());  //java
		
		String s3=new String("Java world");
		System.out.println(s3.substring(3,7)); //a wo
		System.out.println(s3.substring(3)); //a world
		
		
		
		

	}

}
