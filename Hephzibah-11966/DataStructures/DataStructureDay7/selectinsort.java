package DataStructureDay7;

public class selectinsort {

	public static void main(String[] args) {
		int arr[] = { 22, 10, 55, 20, 07, 23 };
		System.out.println("Given array is: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			{
				temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;

			}
		}

		System.out.println("sorting the array in Descending order: ");
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
