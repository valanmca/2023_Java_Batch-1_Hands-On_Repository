package DataStructureDay4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class getqueue {

	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("no of elements :");
		int n=sc.nextInt();
		System.out.println("enter the variables: ");
		for(int i=0; i<n; i++) {
			String a=sc.next();
			queue.offer(a);
			
		}
		System.out.println(queue);
	}

}
