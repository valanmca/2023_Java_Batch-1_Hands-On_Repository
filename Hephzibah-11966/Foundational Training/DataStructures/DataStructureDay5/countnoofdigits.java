package DataStructureDay5;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeMap;

public class countnoofdigits {

	public static void main(String[] args) {
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		LinkedList<Integer> list = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			int n = sc.nextInt();
			list.add(n);
		}
		System.out.println(list);

		for (int i = 0; i < size; i++) {
			int count = 0;
			int n = list.get(i);
			while (n != 0) {
				n = n / 10;
				count++;
			}

			System.out.println("no of digit in number is:" + count);
			map.put(list.get(i), count);
			System.out.println(map);
		}
	}

}
