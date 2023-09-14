package DataStructureDay6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.LinkedList;

public class searchlinkedliststring {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("C");
		list.add("C++");
		list.add("Python");
		list.add("Java");
		list.add("PHP");
		list.add(".Net");

		System.out.println("enter the character:");
		Scanner sc = new Scanner(System.in);
		String k = sc.next();

		boolean isPresent = false;
		for (int i = 0; i < list.size(); i++) {
			if (k.equals(list.get(i))) {
				System.out.println("String is present in the list:" + i);
				isPresent = true;
				break;
			}

		}
		if (isPresent == false) {
			System.out.println("String is not Present in the list");
		}

	}

}
