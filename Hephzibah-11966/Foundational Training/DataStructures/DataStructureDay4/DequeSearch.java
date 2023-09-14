package DataStructureDay4;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Deque;

public class DequeSearch {

	public static void main(String[] args) {
		Deque<String> queue=new LinkedList<String>();
	    queue.offerFirst("A");
	    queue.offerLast("B");
	    queue.offerFirst("C");
	    queue.offerLast("D");
	    queue.offerFirst("E");
		System.out.println(queue);
		System.out.println("enter the variable :");
		Scanner sc = new Scanner(System.in);
		String va= sc.next();
		boolean isPresent = false;
		while(!queue.isEmpty())
		{
			if(va.equals(queue.pollLast()))
			{
			System.out.println("yes");
			isPresent = true;
			break;}
			
		}
		if (!isPresent)
		{
			System.out.println("no");
		}
		// TODO Auto-generated method stub

	}

}
