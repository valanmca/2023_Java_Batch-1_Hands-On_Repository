//Write a Java Programs to create an interfaces Sortable with a method sort (int[] array) that sorts an array of integers in descending order . Create two classes QuickSort and MergeSort that implement the Sortable interfaces and provide their own implementations of the sort() method.
interface Sortable {
	public void sort(int[] array);
}

class QuickSort implements Sortable {
	public void sort(int[] array) {
		quicksort(array, 0, array.length - 1);
	}

	private void quicksort(int[] array, int i, int j) {
		if (i < j) {
			int sorts = sort1(array, i, j);
			quicksort(array, i, sorts - 1);
			quicksort(array, sorts + 1, j);
		}
	}

	private int sort1(int[] array, int i, int j) {
		int call = array[j];
		int k = i - 1;
		for (int u = i; u < j; u++) {
			if (array[u] >= call) {
				k++;
				int temp = array[k];
				array[k] = array[u];
				array[u] = temp;
			}
		}
		int temp = array[k + 1];
		array[k + 1] = array[j];
		array[j] = temp;
		return k + 1;
	}
}

class MergeSort implements Sortable {
	public void sort(int[] array) {
		mergesort(array, 0, array.length - 1);
	}

	private void mergesort(int[] array, int i, int j) {
		if (i < j) {
			int k = (i + j) / 2;
			mergesort(array, i, k);
			mergesort(array, k + 1, j);
			merge(array, i, j, k);
		}
	}

	private void merge(int[] array, int i, int j, int k) {
		int leftSize = k - i + 1;
		int rightSize = j - k;
		int[] leftArray = new int[leftSize];
		int[] rightArray = new int[rightSize];
		for (int l = 0; l < leftSize; l++) {
			leftArray[l] = array[i + l];
		}
		for (int l = 0; l < rightSize; l++) {
			rightArray[l] = array[k + 1 + l];
		}
		int l = 0, p = 0, y = i;
		while (l < leftSize && p < rightSize) {
			if (leftArray[l] >= rightArray[p]) {
				array[y] = leftArray[l];
				l++;
			} else {
				array[y] = rightArray[p];
				p++;
			}
			y++;
		}
		while (l < leftSize) {
			array[y] = leftArray[l];
			l++;
			y++;
		}
		while (p < rightSize) {
			array[y] = rightArray[p];
			p++;
			y++;
		}
	}
}

public class Abstract_Class_Example11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 9, 7, 5, 8, 4, 3, 2, 5, 1 };
		Sortable objs = new QuickSort();
		objs.sort(arr);
		System.out.println("The Descending order using the QuickSort is a :");
		printArray(arr);
		int[] arr4 = { 9, 8, 0, 7, 5, 4, 6, 3, 2, 1 };
		Sortable obj1 = new MergeSort();
		obj1.sort(arr4);
		System.out.println("The Descending order using the MergeSort is a :");
		printArray(arr4);
	}

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

}