//Java - 8 Stream API
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.stream.Collectors;
public class Lambda_Example5 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jki");
		long count = strList.stream().filter(x -> x.isEmpty()).count();
		System.out.println(count);
		List<String> strLists = Arrays.asList("abc", "", "bcd", "", "degh", "jkhlp");
		long counts = strLists.stream().filter(x -> x.isBlank()).count();
		System.out.println(counts);
		System.out.println(strList);
		long number = strList.stream().filter(x -> x.length() > 3).count();
		System.out.println(number);
		long count1 = strList.stream().filter(x -> x.startsWith("a")).count();
		System.out.println(count1);
		List<String> filtered = strList.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());
		System.out.println(filtered);
		List<String> countries = Arrays.asList("USA", "Japan", "Chineses", "Italy", "U.K", "Canada");
		String country = countries.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
		System.out.println(country);
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 9, 8, 0);
		List<Integer> distinct = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
		System.out.println(distinct);
		List<Integer> number1 = Arrays.asList(1, 2, 3, 5, 4);
		number1.stream().map(x -> x * x).forEach(y -> System.out.println(y));
	}

}
