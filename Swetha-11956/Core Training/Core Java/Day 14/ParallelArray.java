package Java8;
//Parallel array
import java.util.Arrays;

public class ParallelArray {

	public static void main(String[] args) {

		int arr[]= {10,4,7,3,9,2};
		
		Arrays.parallelSort(arr,1,4);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
	}

}
