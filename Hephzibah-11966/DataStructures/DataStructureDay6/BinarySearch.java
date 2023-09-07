package DataStructureDay6;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18 };

		System.out.println("enter the Element:");

		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int beg = 0;
		int end = arr.length - 1;
		int mid;
		boolean isPresent = false;
		while (beg <= end) {
			mid = ((beg + end) / 2);

			if (k < arr[mid]) {
				// beg = 0;
				end = mid - 1;
			}
			if (k > arr[mid]) {
				beg = mid + 1;
				// end = arr.length-1;
			}
			if (k == arr[mid]) {
				System.out.println("Element found in index : " + mid);
				isPresent = true;
				break;
			}
		}
		if (isPresent == false) {
			System.out.println("Element not found");
		}
		sc.close();
	}
}
