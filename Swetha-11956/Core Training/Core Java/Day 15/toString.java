package Java11;

//toArray method  sample program.

import java.util.ArrayList;
import java.util.List;

public class toString {

	public static void main(String[] args) {

		List<String>list=new ArrayList<>();
		list.add("Java");
		list.add("Features");
		list.add("Array");
		
		String[] array=list.stream().toArray(String[]::new);
		
		for(String s: array) {
			System.out.println(s);
		}
	}

}
