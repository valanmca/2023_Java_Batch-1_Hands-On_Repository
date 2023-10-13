public class Array_Example2 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		String s1 = "Java";
		String s2 = "java";

		System.out.println(s1.equals(s2));// false(Java is a case sentitive)
		System.out.println(s1.equalsIgnoreCase(s2));// true(It will be don't see the case sentitive)
		System.out.println(s1.charAt(1));// a(It is dispaly the index vaules from the s1 and it is also a case
											// sentitive)
		System.out.println(s1.indexOf('a'));// 1
		System.out.println(s1.lastIndexOf('a'));// 3
		System.out.println(s1.length());// 4
		System.out.println(s1.replace('a', 'z'));// Jzvz
		System.out.println(s1.concat(" World "));// Java World
		System.out.println(s1.toUpperCase());// JAVA
		System.out.println(s1.toLowerCase());// java
		String s3 = "Java World";
		System.out.println(s3.substring(3, 7));// a Wor(java end values is length -1)
		System.out.println(s3.substring(3));// a World
	}

}