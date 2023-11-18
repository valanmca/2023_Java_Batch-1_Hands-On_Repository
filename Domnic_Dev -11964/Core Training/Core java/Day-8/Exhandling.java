package Core_Topic_Domnic_Day_8;

public class Exhandling {

	public static void main(String[] args) {
		int[] a = { 3, 5, 6, 8 ,10,11,1};
		System.out.println(a[2]);
		try {
			System.out.println(a[9]);
		} catch (Exception e) {
			System.out.println("Something went wrong"+e);
		}
		System.out.println(a[1]);

	}

}
