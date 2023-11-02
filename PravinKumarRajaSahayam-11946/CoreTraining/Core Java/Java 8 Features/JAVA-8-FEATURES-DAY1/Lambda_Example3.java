//Java - 8 Parallel Array
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lambda_Example3 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		int[] array = { 101, 203, 130, 340, 150 };
		Arrays.parallelSort(array);
		//Arrays.parallelSort(array,1,4);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
