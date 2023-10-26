package JavaBasics3;

public class Buffer {

	public static void main(String[] args) {

		//String Buffer is mutable object. changes can be modified in same memory. Initial capacity of buffer is 16.
		StringBuffer sb= new StringBuffer ("Java");
		sb.append(" world");
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		//Only java with 4 characters are added.
		//world count does't added to the capacity (java world) "After space world should be added only if it contains 16 characters"
	}

}
