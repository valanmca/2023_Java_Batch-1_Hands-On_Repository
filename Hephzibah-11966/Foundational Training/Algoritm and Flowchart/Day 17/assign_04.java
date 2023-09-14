package integers;

import java.util.Scanner;

public class assign_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Elements : ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		// sum
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("Sum" + sum);

		// avg
		int avg = (sum / arr.length);
		System.out.println("Average" + avg);

		// Search Key Elements in the array
		System.out.println("Enter the number to find in the array : ");
		int num = sc.nextInt();
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				flag = true;
				System.out.println("The element '" + arr[i] + "' is present in : " + (i + 1));
				break;
			}
		}
		if (!flag) {
			System.out.println("The element '" + num + "' is not present in the list ");
		}
		// count no of occurrence in the array

		System.out.println("Enter the number to find its no of occurrence: ");
		int occ = sc.nextInt();
		sc.close();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == occ) {
				count++;
			}
		}
		System.out.println("The num '" + occ + "' has occurred '" + count + "' times");
	}
}
