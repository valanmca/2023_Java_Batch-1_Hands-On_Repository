package DataStructureDay2;

import java.util.LinkedList;
import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<Integer> ();
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int num=1;
		for(int i=1;i<=n; i++) {
			num=num*i;
		}
		System.out.println(num);
		

	}

}
