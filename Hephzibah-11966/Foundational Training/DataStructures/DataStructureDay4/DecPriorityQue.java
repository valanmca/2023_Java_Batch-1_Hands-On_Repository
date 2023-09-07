package DataStructureDay4;
import java.util.Queue;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class DecPriorityQue {

	public static void main(String[] args) {
		Queue<String> queue=new PriorityQueue<String>(Comparator.reverseOrder());//Descending order
		queue.offer("B");
		queue.offer("E");
		queue.offer("A");
		queue.offer("D");
		queue.offer("C");
		System.out.println(queue);//A,C,B,E,D
		
		queue.poll();//remove 1st element A as in Descending order
		System.out.println(queue);
		
		queue.poll();//remove 1st element as in Descending order
		System.out.println(queue);
		
		queue.poll();//remove 1st element as in Descending order
		System.out.println(queue);
		// TODO Auto-generated method stub

	}

}
