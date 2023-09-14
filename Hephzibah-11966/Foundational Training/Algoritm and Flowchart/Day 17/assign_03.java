package integers;

import java.util.LinkedList;
import java.util.Scanner;

public class assign_03 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the list :");
		int length = sc.nextInt();
		System.out.println("Enter the Elements : ");
		for (int i = 0; i < length; i++) {
			list.add(sc.nextInt());
		}

		System.out.println("Enter the element to search in the list : ");
		int find = sc.nextInt();
		sc.close();
		boolean temp = false;
		for (int i = 0; i < list.size(); i++) {
			if (find == list.get(i)) {
				temp = true;
				System.out.println("The element '" + list.get(i) + "' is present in : " + (i + 1));
				break;
			}
		}
		if (!temp) {
			System.out.println("-1");
		}

	}

}
