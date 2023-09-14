package DataStructureDay4;
import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class AscenPriorityQu {

	public static void main(String[] args) {
		Queue<String> queue=new PriorityQueue<String>();//Ascending order
		queue.offer("B");
		queue.offer("E");
		queue.offer("A");
		queue.offer("D");
		queue.offer("C");
		System.out.println(queue);//A,C,B,E,D
		
		queue.poll();//remove 1st element A as in ascending order
		System.out.println(queue);
		
		queue.poll();//remove 1st element as in ascending order
		System.out.println(queue);
		
		queue.poll();//remove 1st element as in ascending order
		System.out.println(queue);
		
		

	}

}
