package DataStructureDay7;

public class sort {

	public static void main(String[] args) {
		int arr[] = { 22, 10, 55, 20, 07, 23 };
		System.out.println("Given Array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("sorting the array in Descending order: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
