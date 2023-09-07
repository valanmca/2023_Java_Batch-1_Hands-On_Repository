package DataStructureDay4;

import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class countque {

	public static void main(String[] args) {
		Queue<Integer> queue1 = new LinkedList<Integer>();
		Queue<Integer> queue2 = new LinkedList<Integer>();

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of elements :");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			queue1.offer(num);
		}
		System.out.println(queue1);

		for (int i = 0; i < n; i++) {
			int count = 0;
			int element = queue1.poll();
			while (element != 0) {
				element = element / 10;
				count++;
			}
			queue2.offer(count);
		}
		System.out.println(queue2);
		
		}
	}
	

}
