package Day_3;

public class String_operations {

	public static void main(String[] args) {
		
		String s1 = "Java";
		char ch[] = s1.toCharArray();
		
		for(char c:ch) {
			System.out.println(c);
		}
		
		String s2 = "Welcome to java";
		
		String coll[] = s2.split(" ");
		System.out.println("Spliting string using white spaces");
		for(String s:coll) {
			System.out.println(s);
		}
		
//		Strings are immutable objects in java
		
		s1 = s1.toUpperCase();
		s1.toLowerCase(); // this will not get connected with s1 because we don't assign it with any variable
		System.out.println("---------");
		System.out.println(s1);
	}

}
