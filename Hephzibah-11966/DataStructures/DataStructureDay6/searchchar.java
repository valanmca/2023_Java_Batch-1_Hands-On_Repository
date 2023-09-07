package DataStructureDay6;

import java.util.ArrayList;

import java.util.Scanner;

public class searchchar {

	public static void main(String[] args) {
		ArrayList<Character> list = new ArrayList<Character>();
		list.add('B');
		list.add('E');
		list.add('A');
		list.add('F');
		list.add('H');
		list.add('K');

		System.out.println("enter the character:");
		Scanner sc = new Scanner(System.in);
		int k = sc.next().charAt(0);

		boolean isPresent = false;
		for (int i = 0; i < list.size(); i++) {
			if (k == list.get(i)) {
				System.out.println("Character is present in the array:" + i);
				isPresent = true;
				break;
			}

		}
		if (isPresent == false) {
			System.out.println("Character is not Present in the array");
		}
		// TODO Auto-generated method stub

	}

}
