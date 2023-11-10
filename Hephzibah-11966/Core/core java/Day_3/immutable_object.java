package Day_3;

public class immutable_object {

	public static void main(String[] args) {
		String s1="Java";
		
		s1.concat(" World");//immutable object   //here world will save another memory, so ith won't display the memory
		System.out.println(s1);
		
		s1=s1.concat(" World"); //here world is stored in s1 memory
		System.out.println(s1);
		
		s1.toUpperCase();    //immutable object 
		System.out.println(s1);
		
		s1=s1.toUpperCase();
		System.out.println(s1);
		
	}

}
