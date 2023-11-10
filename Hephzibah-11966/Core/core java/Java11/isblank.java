package Java11;

import java.util.stream.Stream;

public class isblank {

	public static void main(String[] args) {
		String str="Hai";
		Stream<String>strs=str.lines();
		strs.forEach(st->System.out.println(st));
		System.out.println("\n");
		Stream<String> strAns=str.lines();
		strAns.forEach(System.out::println);
		String s1="";
		String s2="";
		String s3="Mad";
		System.out.println("s1 is blank?:" +s1.isBlank());
		System.out.println("s2 is blank?:" +s2.isBlank());
		System.out.println("s3 is blank?:" +s3.isBlank());
		

	}

}
