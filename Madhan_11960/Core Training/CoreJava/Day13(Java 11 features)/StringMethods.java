import java.util.stream.Stream;

public class StringMethods {

	public static void main(String[] args) {
		//isBlank() Method
		String s1="";
		String s2="";
		String s3="Madhan";
		
		System.out.println("S1 is Blank :"+s1.isBlank());
		System.out.println("S2 is Blank :"+s2.isBlank());
		System.out.println("S3 is Blank :"+s3.isBlank());
		
		//lines() method
		String str="Hii Hephzii \nMCA \nSivaganga";
		Stream<String>stream=str.lines();
		stream.forEach(st->System.out.println(st));
		
		Stream<String>stream1=str.lines();
		stream1.forEach(System.out::println);
		
		//repeat() method
		System.out.println("Mad".repeat(5));
		
		//Strip method
		System.out.println("    1    A ".strip());
		
		//StripLeading method
		System.out.println("             Hii Java".stripLeading());
		
		//StripTrailing method
		System.out.println("  1".stripTrailing());
		System.out.println(" 11".stripTrailing());
		System.out.println("111".stripTrailing());
		
	}

}
