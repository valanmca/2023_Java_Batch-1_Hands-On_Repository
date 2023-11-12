package Java8;

import java.util.ArrayList;

public class forEach {

	public static void main(String[] args) {

		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Swetha");
		list.add("Arun");
		list.add("Vasa");
		list.add("Padmasri");
		//list .forEach(student -> System.out.println(student));
		
		System.out.println("------------------");
		list.forEach(System.out::println);
		
		
	}

}
