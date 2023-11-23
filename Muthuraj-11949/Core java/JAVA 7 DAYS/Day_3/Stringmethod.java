package Day_3;
//String Class Methods
public class Stringmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Java";
		String s2="Java";
		
		System.out.println(s1.equals(s2));//False
		System.out.println(s1.equalsIgnoreCase(s2));//true
		System.out.println(s1.charAt(1));//a
		System.out.println(s1.indexOf('a'));//1
		System.out.println(s1.lastIndexOf('a'));//3
		System.out.println(s1.replace('a', 'z')); //Jzvz
		System.out.println(s1.toUpperCase());//java
		System.out.println(s1.toLowerCase());//java
	
		
		String s3="Java world";
		System.out.println(s3.substring(3,7));// a  wo
		System.out.println(s3.substring(3)); // a world
		
		
		
		

	}

}
