package DataStructureDay3;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements: ");
		int num = sc.nextInt();

		String str = "";
		for (int i = 1; i <= num; i++) {
			str = str + "*";
			System.out.println(str);
		}
	}

}
