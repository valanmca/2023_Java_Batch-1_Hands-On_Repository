package Day_3;

public class string_buffer {

	public static void main(String[] args) {
		// StringBuffer is mutable object in java
		
		StringBuffer sb = new StringBuffer("Java");
		StringBuffer ssb = new StringBuffer();
		System.out.println(sb);
		sb.append("World");
		System.out.println(sb);
		
		System.out.println(sb.capacity());
		System.out.println(ssb.capacity());
	}

}
