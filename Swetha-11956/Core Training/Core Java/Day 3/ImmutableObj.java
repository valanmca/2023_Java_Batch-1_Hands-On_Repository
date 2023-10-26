package JavaBasics3;

public class ImmutableObj {

	public static void main(String[] args) {

		String s1="Java";
		
		s1.concat("world");  // It is an immutable object modifying in different memory ,it returns only "Java".
		System.out.println(s1);
		s1=s1.concat(" world"); //Modifying and storing it in s1 results "Java world".
		System.out.println(s1);
		
		System.out.println("");
		
		//Immutable object ,modified in different memory ,no changes happened in s1.
		s1.toUpperCase();
		System.out.println(s1);
		
		//Modifying and storing it in s1 , can be reflected.
		s1=s1.toUpperCase();
		System.out.println(s1);
	}

}
