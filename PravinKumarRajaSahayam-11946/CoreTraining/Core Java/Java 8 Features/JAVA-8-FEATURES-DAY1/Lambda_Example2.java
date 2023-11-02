//Java - 8 Optional class
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Lambda_Example2 {
	public static void main(String[] args) {
// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(40);
		list.add(80);
		Optional<List<Integer>> lopt = Optional.of(list);
		System.out.println(lopt.get());
		int value = 9;
		Optional<Integer> opt1 = Optional.of(value);
		System.out.println(opt1.get());
		String[] str = new String[10];
		str[1] = "Java";
		str[2] = "Programs";
		str[3] = "PravinKumar";
		Optional<String> opt = Optional.ofNullable(str[1]);
		if (opt.isPresent()) {
			String str1 = str[1].concat(" " + str[2] + " " + str[3]);
			System.out.println(str1);
			System.out.println(opt.get());
			System.out.println(opt.isEmpty());
			System.out.println(opt.hashCode());
		} else {
			System.out.println("String value is not present");
		}
	}

}
