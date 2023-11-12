package Java8;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamMethods {

	public static void main(String[] args) {

		List<String> strlist=Arrays.asList("abc"," ","def","","ghi","jklm");
		long count=strlist.stream()
				//.filter(x-> x.isEmpty()) //counting the number of white spaces.
				.filter(x-> x.isBlank())
				.count();
		System.out.println(count);
		
		//length greater than 3
		long num=strlist.stream()
			.filter(x-> x.length()>3)
			.count();
		System.out.println(num);
		
		//Start with a
		long count1=strlist.stream()
				.filter(x-> x.startsWith("a"))
				.count();
		System.out.println(count1);
		
		//Checking not empty
		
//		long count2=filtered.stream()
//				.filter(x->! x.isEmpty()) //counting the number of white spaces.
//				.collect(Collectors.toList());
//				
//		System.out.println(filtered);
		
		//Square 
		List<Integer>numbers =Arrays.asList(9,20,3,4,7,3,4);
		List<Integer> distinct=numbers.stream()
				.map(i->i*i)
				.distinct()
				.collect(Collectors.toList());
		System.out.println(distinct);
		
		//
		
//		List<String>countries =Arrays.asList("India","China","Australia","France");
//		String country=countries.stream();
		
	}

}
